package com.atguigu.java;

class Window4 extends Thread{
    private static int ticket = 300;
    final static Object obj = new Object();
    @Override
    public void run() {
        while (true) {
          show();
        }
    }

    private static synchronized void show(){
        if (ticket > 0) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + "票号：" + ticket);
            ticket--;
        }
    }
}
public class WindowTest4{
    public static void main(String[] args) {
        Window4 t1 = new Window4();
        Window4 t2 = new Window4();
        Window4 t3 = new Window4();

        t1.setName("线程一");
        t2.setName("线程二");
        t3.setName("线程三");

        //通过Thread类的调对象调用start();
        t1.start();
        t2.start();
        t3.start();
    }
}
