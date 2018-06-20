package com.zs.test2;

/**
 * @author : zhousong
 * Create in 2018/6/19
 */
public class TimeClient {

    public static void main(String[] args) {
        int port = 8080;
        if (args != null && args.length > 0) {
            try {
                port = Integer.valueOf(args[0]);
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }

        new Thread(new TimeClientHandler("127.0.0.1", port), "TimeClient-001").start();
    }

}
