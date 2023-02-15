package com.atguigu.java;

/**
    例子：
        开三个线程，卖一百张票
 */
class Window extends Thread {
    private static int ticket = 100;

    @Override
    public void run() {
        while (true) {
            if (ticket > 0) {
                System.out.println(getName() + ":" + ticket);
                ticket--;
            } else {
                break;
            }
        }
    }
}


