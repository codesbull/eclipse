package com.hw.wjn.server;

import com.common.dict.Constant2;
import com.hw.wjn.callback.Callback;
import com.hw.wjn.dict.Constant;
import com.hw.wjn.intf.ISend;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server implements ISend {
    private ServerSocket server = null;
    private Socket client = null;
    private BufferedReader reader = null;
    //    private PrintWriter writer=null;
    private PrintStream out;
    private Callback callback;

    public Server(Callback callback) {
        this.callback = callback;
    }

    public void close() throws IOException {
        //        out.close();
        //        out=null;
        //        reader.close();
//        SocketThread.isShutdown = true;//TODO 
        reader = null;
        if (client != null && !client.isClosed()) {
            client.close();
            client = null;
        }
        if (!server.isClosed()) {
            server.close();
            server = null;
        }
    }

    public void send(String sendMsg) {
        System.out.println("server send data");
        out.println(sendMsg);
        out.flush();
    }

    public Socket getClientSocket() {
        return client;
    }

    public void init() throws Exception {
        int port = Constant.port;
        server = new ServerSocket(port);
        System.out.println("socket server started,port :" + port);
        new Thread(new Runnable() {

            @Override
            public void run() {
                while (true) {
                    try {

                        client = server.accept();
                        System.out.println("有客户端连接成功 :" + client.getLocalAddress().getHostAddress());
                        ServerApp.isConnected = true;
                        reader = new BufferedReader(new InputStreamReader(
                                client.getInputStream()));
                        out = new PrintStream(client.getOutputStream());
                        out.println(Constant2.CRLF_newLine_placeholder + "connect successfully");
                        if (null != callback) {
                            callback.callback(null, client);
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                        System.out.println("error");
                        return;
                    }
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }
        }).start();
    }
}
