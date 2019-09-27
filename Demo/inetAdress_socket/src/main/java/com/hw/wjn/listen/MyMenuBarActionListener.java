package com.hw.wjn.listen;

import com.hw.wjn.client.ClientApp;
import com.hw.wjn.dict.Constant;
import com.string.widget.util.ValueWidget;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyMenuBarActionListener implements ActionListener {
    private ClientApp clientApp;

    public MyMenuBarActionListener(ClientApp clientApp) {
        this.clientApp = clientApp;
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        String command = event.getActionCommand();
        if (ValueWidget.isNullOrEmpty(command)) {
            return;
        }
        if (command.equals("重新连接")) {
            try {
                this.clientApp.connect2Server(Constant.port);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (command.equals("断开连接")) {
            this.clientApp.closeSocket();
        }
    }
}
