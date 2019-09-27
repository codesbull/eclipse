package com.hw.wjn.callback;

import java.net.Socket;

/***
 * 其实作用就是为了唤醒窗口,<br />
 * 见com/hw/wjn/generic/GenericApp.java 中的Callback成员变量
 */
public interface Callback {
    void callback(String msg, Socket socket);
}
