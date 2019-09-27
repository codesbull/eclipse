package com.hw.wjn.generic;

import com.common.dict.Constant2;
import com.common.util.SystemHWUtil;
import com.hw.wjn.SocketThread;
import com.hw.wjn.callback.Callback;
import com.hw.wjn.intf.ISend;
import com.swing.component.AssistPopupTextArea;
import com.swing.component.AssistPopupTextPane;
import com.swing.messagebox.GUIUtil23;

import javax.swing.*;
import javax.swing.text.DefaultCaret;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.net.Socket;

public class GenericApp extends JFrame {
    /***
     * Dialogue display area
     */
    protected AssistPopupTextPane recordTP;
    protected AssistPopupTextArea chatTA;
    protected JButton sendButton;
    protected SocketThread socketThread;
    /***
     * 其实作用就是为了唤醒窗口<br />
     * 具体调用是在com/hw/wjn/SocketThread.java 中<br />
     * 在接收到消息之后触发
     */
    protected Callback callback = new Callback() {
        @Override
        public void callback(String msg, Socket socket) {
//使窗口处于激活状态
            GenericApp.this.toFront();
            GenericApp.this.requestFocus();
        }
    };

    protected void sendMsg(ISend send) {
        String sendMsg = chatTA.getText2();
        sendMsg = sendMsg.replace(SystemHWUtil.CRLF, Constant2.CRLF_newLine_placeholder);
        chatTA.setText(SystemHWUtil.EMPTY);
        try {
            if (sendMsg != null && (!"".equals(sendMsg))) {
                send.send(sendMsg);
                socketThread.record_myself(sendMsg.replace(Constant2.CRLF_newLine_placeholder, SystemHWUtil.CRLF));
            } else {
                /*JOptionPane.showMessageDialog(null, "can not be null",
                        " warning", JOptionPane.WARNING_MESSAGE);*/
            }
        } catch (Exception e) {
            e.printStackTrace();
            GUIUtil23.errorDialog(e.getMessage());
        }
        chatTA.requestFocus();
    }

    protected void buildRecordTp(String tips) {
        recordTP = new AssistPopupTextPane();
        recordTP.setText(tips);
        recordTP.setEditable(false);
        recordTP.setAutoscrolls(true);
        DefaultCaret caret = (DefaultCaret) recordTP.getCaret();
        caret.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);
    }

    protected void buildChatTa(String hello) {
        chatTA = new AssistPopupTextArea();
//		chatTA.setBackground(new Color(100, 100, 255));
        chatTA.setText(hello);
        chatTA.placeHolder("这是聊天输入框,(Alt/option+Enter 即可发送)");
        chatTA.setLineWrap(true);
        chatTA.setWrapStyleWord(true);
        chatTA.setRows(5);
        chatTA.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent event) {
                // super.keyPressed(event);
                // System.out.println(event.getKeyCode());
                if (event.getKeyCode() == KeyEvent.VK_ENTER) {
                    if (event.isControlDown()
                            || event.isAltDown()) {
                        sendButton.doClick();
                    }
                }
            }
        });
    }


}
