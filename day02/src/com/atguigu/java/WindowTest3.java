package com.atguigu.java;

class Window3 implements Runnable{
    private int ticket = 1000;

    @Override
    public void run() {
        while(true){
            show();
        }
    }
    private synchronized void show(){
        if (ticket > 0) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "票号：" + ticket);
            ticket--;
        }
    }
}
public class WindowTest3 {
    public static void main(String[] args) {
        Window3 q = new Window3();
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