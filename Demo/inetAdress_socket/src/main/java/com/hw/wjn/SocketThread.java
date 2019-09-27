package com.hw.wjn;

import com.common.dict.Constant2;
import com.common.util.SystemHWUtil;
import com.hw.wjn.callback.Callback;
import com.swing.component.ComponentUtil;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.SocketException;

/***
 * Read message sent by each other<br />
 * 在线程中调用 area.setText(msg)  会卡死<br />
 * 原因是因为使用了 JScrollPane<br />
 * 解决方法:JScrollPane 包住一个JPanel,
 * JPanel里面包住JTextPane   即可<br />
 * area.updateUI()
 *
 * @author huangwei
 *
 */
public class SocketThread implements Runnable {

    private JTextPane area;
    /***
     * server or client
     */
    private Socket socket;
    public boolean isShutdown = false;
    private StringBuffer sb = new StringBuffer();
    private static String myself = "me say:";
    /***
     * the address/name of Other side
     */
    private String opposite_side = null;
    private BufferedReader reader;
    private int originHeight = 0;
    private Callback callback;

    public SocketThread(JTextPane area, Socket socket, String opposite_side, Callback callback) {
        super();
        this.area = area;
        originHeight = this.area.getHeight();
        this.socket = socket;
        this.opposite_side = opposite_side;
        this.callback = callback;
    }

    /*private void  adapteHeight(JTextPane     area){
       int height= area.getHeight();
        System.out.println("height :" + height);
    }*/
    public void record_myself(String info) {
        sb.append(myself).append("\t").append(info);
        sb.append(SystemHWUtil.CRLF);
        area.setText(sb.toString());
        area.updateUI();
    }

    @Override
    public void run() {
        String readline = null;

        try {
            reader = new BufferedReader(new InputStreamReader(
                    socket.getInputStream()));

            int zeroCount = 0;//如果连续两次都是读取字节数为0,则直接退出循环
            while (reader != null && (!isShutdown()) && socket != null && !socket.isClosed()
                /*&& reader.ready()*/) {
                try {

                    if (!socket.isConnected() || socket.isClosed()) {
                        break;
                    }
                    while ((!isShutdown()) && (!socket.isClosed())
                            /* && reader.ready()*///reader.ready() is needed
                            && (readline = reader.readLine()) != null) {//当socket连接正常,但是没有写入内容时,会在该行阻塞,但是对方socket异常断开,则不会阻塞
                        readline = readline.replace(Constant2.CRLF_newLine_placeholder, SystemHWUtil.CRLF);
                        sb.append(opposite_side).append(" say:").append("\t").append(readline).append(SystemHWUtil.CRLF);
                        System.out.println("start :");
                        String msg = sb.toString();
                        ComponentUtil.appendResult(area, opposite_side + " say:" + readline, true);
                        System.out.println("end :");
                        area.updateUI();
                        focusEnd(area);
//                        adapteHeight(area);
                        zeroCount = 0;
                        if (null != this.callback) {
                            this.callback.callback(readline, socket);
                        }
                    }
                    zeroCount++;
                    if (zeroCount > 2) {//如果连续两次都是读取字节数为0,则直接退出循环
                        //什么时候会这样呢?当对方意外断开的时候
                        System.out.println("break :zeroCount");
                        break;
                    }
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                        break;
                    }
                    reader = new BufferedReader(new InputStreamReader(
                            socket.getInputStream()));
                } catch (SocketException e) {
                    e.printStackTrace();
                    System.out.println("退出循环 :");
                    break;
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("退出逊汗 :");
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }

    public static void focusEnd(JTextPane tp) {
//    	tp.setCaretPosition(tp.getText().length()-1);

//    	tp.requestFocus();
    }

    public void close() {
        if (reader != null) {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            reader = null;
        }
        if (socket != null) {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        setShutdown(true);
    }

    public synchronized boolean isShutdown() {
        return isShutdown;
    }

    public synchronized void setShutdown(boolean isShutdown) {
        this.isShutdown = isShutdown;
    }

    public Socket getSocket() {
        return socket;
    }
}
