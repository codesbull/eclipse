package com.hw.wjn.client;

import com.hw.wjn.dict.Constant;
import com.hw.wjn.intf.ISend;
import com.string.widget.util.ValueWidget;

import java.io.*;
import java.net.Socket;

public class Client implements ISend {
    private Socket server;
    private BufferedReader reader;
    private PrintWriter writer;
    public static boolean isConnected = false;
    // private String serverIP="localhost";
    PrintStream out = null;

    public void close() throws IOException {
        // out.close();
        // out=null;
        // reader.close();
        // reader=null;
//		SocketThread.isShutdown = true;//TODO
        if (server != null && !server.isClosed()) {
            server.close();
            server = null;
        }
        if (server != null) {
            server = null;
        }
    }

    public void init(String serverIp, Integer port) throws Exception {
        if (null == port) {
            port = Constant.port;
        }
        System.out.println("客户端尝试连接socket server :" + serverIp);
        server = new Socket(serverIp, port);
        System.out.println("客户端连接成功 :" + serverIp);
        server.setKeepAlive(true);
        isConnected = true;
        reader = new BufferedReader(new InputStreamReader(
                server.getInputStream()));
        writer = new PrintWriter(server.getOutputStream());
        out = new PrintStream(server.getOutputStream());

    }

    public Socket getServerSocket() {
        return server;
    }

    public void send(String sendMsg) {
        if (ValueWidget.isNullOrEmpty(writer)) {

        } else {
            System.out.println("client send data");
            writer.write(sendMsg + "\n");
            writer.flush();
        }

        // out.println
    }

}
