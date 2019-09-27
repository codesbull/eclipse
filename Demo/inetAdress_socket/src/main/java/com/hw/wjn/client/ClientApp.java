package com.hw.wjn.client;

import com.hw.wjn.SocketThread;
import com.hw.wjn.dict.Constant;
import com.hw.wjn.generic.GenericApp;
import com.hw.wjn.listen.MyMenuBarActionListener;
import com.swing.component.AssistPopupTextField;
import com.swing.component.SmartScroller;
import com.swing.dialog.toast.ToastMessage;
import com.swing.messagebox.GUIUtil23;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;

public class ClientApp extends GenericApp {
    private static final long serialVersionUID = -5318756103783879138L;
//    public static final String CRLF_newLine_placeholder = "%0A###";

    private JButton connButton = null;
    private Client client;
    private AssistPopupTextField serverIPTF = null;
    private String serverIp = "localhost";


    public void layout(Container c) {
        this.setTitle("Client");
        c.setLayout(new BorderLayout());
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new BorderLayout());
        String tips = " from server:";
        buildRecordTp(tips);

        JPanel historyPanel = new JPanel();
        historyPanel.setLayout(new BorderLayout());
        historyPanel.add(recordTP);
        JScrollPane scroll = new JScrollPane(historyPanel);
        new SmartScroller(scroll);
        topPanel.add(scroll, BorderLayout.CENTER);
        Border border1 = BorderFactory.createEtchedBorder(Color.white,
                new Color(148, 145, 140));
        TitledBorder chatRecordTitle = new TitledBorder(border1, "chat record");
//        scroll.setBorder(chatRecordTitle); 加上这个会卡
        c.add(topPanel, BorderLayout.CENTER);

        JPanel chatPane = new JPanel();
        chatPane.setLayout(new BorderLayout());
        String hello = "Hi,I am client!";
        buildChatTa(hello);
        // JPanel chatPanel_tmp = new JPanel();
        // chatPanel_tmp.setBackground(Color.red);
        // chatPanel_tmp.add((chatTA));
        JScrollPane chatScroll = new JScrollPane(chatTA);
        Border border2 = BorderFactory.createEtchedBorder(Color.white,
                new Color(148, 145, 140));
        TitledBorder chatitle = new TitledBorder(border2, "chat input");
        chatScroll.setBorder(chatitle);
        chatPane.add(chatScroll, BorderLayout.CENTER);

        sendButton = new JButton("send");
        sendButton.setEnabled(false);
        sendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                sendMsg(client);
            }
        });
        JPanel buttonPane = new JPanel();
        buttonPane.add(sendButton);

        this.connButton = new JButton("connect");
        this.connButton.setMnemonic('C');
        this.connButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                client = new Client();
                try {
                    final JDialog dialog = new JDialog(ClientApp.this, true);
                    dialog.setLayout(new FlowLayout());
                    dialog.setSize(300, 300);
                    Dimension screensize = Toolkit.getDefaultToolkit()
                            .getScreenSize();
                    Dimension framesize = dialog.getSize();
                    int x = (int) screensize.getWidth() / 2
                            - (int) framesize.getWidth() / 2;
                    int y = (int) screensize.getHeight() / 2
                            - (int) framesize.getHeight() / 2;
                    dialog.setLocation(x, y);

                    serverIPTF = new AssistPopupTextField(20);
                    serverIPTF.setText("localhost");

                    final JButton okBtn = new JButton("ok");
                    dialog.add(serverIPTF);

                    final AssistPopupTextField portTf = new AssistPopupTextField();
                    portTf.setText(String.valueOf(Constant.port), true);
                    portTf.placeHolder("端口号");
                    dialog.add(portTf);

                    dialog.add(okBtn);
                    okBtn.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            serverIp = serverIPTF.getText();
                            if (!serverIp.equals("localhost")
                                    && !serverIp
                                    .matches("[\\d]{1,3}([\\d]+.)+")) {
                                JOptionPane.showMessageDialog(null,
                                        "ip is not valid", " warning",
                                        JOptionPane.WARNING_MESSAGE);
                                return;
                            }
                            dialog.dispose();
                        }
                    });
                    serverIPTF.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            okBtn.doClick();
                        }
                    });
                    System.out.println("dialog open...");
                    dialog.setVisible(true);
                    // Here blocked, not progresses downward
                    //连接服务器
                    connect2Server(Integer.parseInt(portTf.getText()));
                } catch (Exception e) {
                    GUIUtil23.errorDialog(e.getMessage());
                    e.printStackTrace();
                }
            }
        });
        buttonPane.add(connButton);

        chatPane.add(buttonPane, BorderLayout.SOUTH);
        c.add(chatPane, BorderLayout.SOUTH);

        new Thread(new Runnable() {

            @Override
            public void run() {
                while (true) {
                    if (Client.isConnected) {
                        sendButton.setEnabled(true);
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
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent arg0) {
                super.windowClosing(arg0);
                try {
                    if (client != null) {
                        client.close();
                    }
                    if (socketThread != null) {
                        socketThread.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        setMenu();
    }


    public void connect2Server(int port) throws Exception {
        System.out.println("Here blocked, not progresses downward");
        if (null == client) {
            client = new Client();
        }
        client.init(serverIp, port);
        connButton.setEnabled(false);
        socketThread = new SocketThread(recordTP, client
                .getServerSocket(), "server", callback);
        new Thread(socketThread).start();
    }

    public void closeSocket() {
        if (null != socketThread) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    socketThread.close();//会阻塞
                    ToastMessage.toastRight("断开连接", 2000);
                }
            }).start();
        }
    }

    private void setMenu() {
        JMenuBar menuBar = new JMenuBar();
        JMenu fileM = new JMenu("File");
        JMenuItem reconnectM = new JMenuItem("重新连接");
        JMenuItem closeM = new JMenuItem("断开连接");

        MyMenuBarActionListener myMenuBarActionListener = new MyMenuBarActionListener(this);
        reconnectM.addActionListener(myMenuBarActionListener);
        closeM.addActionListener(myMenuBarActionListener);

        fileM.add(reconnectM);
        fileM.add(closeM);
        menuBar.add(fileM);
        setJMenuBar(menuBar);
    }

    public static void main(String[] args) {
        new ClientApp().launchFrame();

    }

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
        this.setLocation(x + 300, y);
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
