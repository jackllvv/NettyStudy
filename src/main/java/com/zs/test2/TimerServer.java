package com.zs.test2;

/**
 * @author : zhousong
 * Create in 2018/6/19
 */
public class TimerServer {
    public static void main(String[] args) {
        int port = 8080;
        if (args != null && args.length > 0) {
            port = Integer.valueOf(args[0]);
        }

        MultiplexerTimeServer timeServer = new MultiplexerTimeServer(port);

        new Thread(timeServer, "NIO-MultiplexerTimerServer-001").start();
    }
}
