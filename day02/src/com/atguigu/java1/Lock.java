package com.atguigu.java1;

import java.util.concurrent.locks.ReentrantLock;

class Window5 implements Runnable {
    private int ticket = 1000;
    private ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            try {
                lock.lock();
                if (ticket > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "票号：" + ticket);
                    ticket--;
                } else {
                    break;
                }
            }finally {
            lock.unlock();
            }
        }

    }
}

public class Lock {
    public static void main(String[] args) {
        Window5 q = new Window5();
        Thread t1 = new Thread(q);
        Thread t2 = new Thread(q);
        Thread t3 = new Thread(q);


        t1.setName("线程一");
        t2.setName("线程二");
        t3.setName("线程三");

        //通过Thread类的调对象调用start();
        t1.start();
        t2.start();
        t3.start();
    }
}
