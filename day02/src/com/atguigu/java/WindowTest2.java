package com.atguigu.java;

class Window1 extends Thread{
    private  int ticket = 30;
    final static Object obj = new Object();
    @Override
    public void run() {
            while (true) {
        synchronized(obj) {
                if (ticket > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(Thread.currentThread().getName() + "票号：" + ticket);
                    ticket--;
                } else {
                    break;
                }
            }
        }
    }
}
public class WindowTest2 {
    public static void main(String[] args) {
        Window1 t1 = new Window1();
        Window1 t2 = new Window1();
        Window1 t3 = new Window1();

        t1.setName("线程一");
        t2.setName("线程二");
        t3.setName("线程三");
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);

        //通过Thread类的调对象调用start();
        t1.start();
        t2.start();
        t3.start();
    }
}
