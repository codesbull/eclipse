package com.hw.wjn.server;

import com.hw.wjn.SocketThread;
import com.hw.wjn.callback.Callback;
import com.hw.wjn.generic.GenericApp;
import com.swing.component.SmartScroller;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.net.Socket;

public class ServerApp extends GenericApp {
    private static final long serialVersionUID = -5318756103783879138L;
    public static boolean isConnected = false;
    private Server server;

    public void layout(Container c) {
        this.setTitle("Server");
        c.setLayout(new BorderLayout());
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new BorderLayout());
        buildRecordTp(" from client:");

        JPanel historyPanel = new JPanel();
        historyPanel.setLayout(new BorderLayout());
        historyPanel.add(recordTP);
        JScrollPane scroll = new JScrollPane(historyPanel);
        new SmartScroller(scroll);
        topPanel.add(scroll, BorderLayout.CENTER);
        Border border1 = BorderFactory.createEtchedBorder(Color.white,
                new Color(148, 145, 140));
        TitledBorder chatRecordTitle = new TitledBorder(border1, "chat record");
        scroll.setBorder(chatRecordTitle);
        c.add(topPanel, BorderLayout.CENTER);

        JPanel chatPane = new JPanel();
        chatPane.setLayout(new BorderLayout());
        buildChatTa("Hi,I am server!");
        JScrollPane chatScroll = new JScrollPane(chatTA);
        Border border2 = BorderFactory.createEtchedBorder(Color.white,
                new Color(148, 145, 140));
        TitledBorder chatitle = new TitledBorder(border2, "chat input");
        chatScroll.setBorder(chatitle);
        chatPane.add(chatScroll, BorderLayout.CENTER);
        chatPane.setBackground(Color.red);
        sendButton = new JButton("send");
        sendButton.setEnabled(false);
        sendButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                sendMsg(server);
            }
        });
        JPanel buttonPane = new JPanel();
        buttonPane.add(sendButton);
        chatPane.add(buttonPane, BorderLayout.SOUTH);
        c.add(chatPane, BorderLayout.SOUTH);

        startServer();
        startListen();

        this.addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent arg0) {
                super.windowClosing(arg0);
                try {
                    Socket clientSocket = server.getClientSocket();
                    //shutdown client socket
                    if (clientSocket != null && !clientSocket.isClosed()) {
                        clientSocket.close();
                    }
                    //shutdown server socket
                    server.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /***
     * start/launch server
     */
    private void startServer() {
        server = new Server(new Callback() {
            @Override
            public void callback(String msg, Socket socket) {
                startThread();
            }
        });
        try {
            server.init();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /***
     * As long as a start the server , start listening client i/o.
     */
    private void startListen() {
        new Thread(new Runnable() {

            @Override
            public void run() {
                while (true) {
                    if (isConnected) {
                        sendButton.setEnabled(true);
                        startThread();
                        break;
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

    private void startThread() {
        socketThread = new SocketThread(recordTP,
                server.getClientSocket(), "client", callback);
        new Thread(socketThread).start();
    }

    public static void main(String[] args) {
        new ServerApp().launchFrame();

    }

    // @Override
    // public void paint(Graphics g)
    // {
    // g.drawImage(image, 10, 10, this);
    // g.drawLine(100, 100, 300, 300);
    // }

    public void launchFrame() {
        Container c = this.getContentPane();
        layout(c);
        Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
        this.setSize(400, 400);
        Dimension framesize = this.getSize();
        int x = (int) screensize.getWidth() / 2 - (int) framesize.getWidth()
                / 2;
        int y = (int) screensize.getHeight() / 2 - (int) framesize.getHeight()
                / 2;
        this.setLocation(x - 240, y);
        this.setDefaultCloseOperation(3);
        this.addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent arg0) {
                super.windowClosing(arg0);
            }

        });
        this.setVisible(true);

    }

}
