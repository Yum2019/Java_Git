package com.atguigu.java;

class Window1 implements Runnable{
    private int Ticket1 = 100;
    @Override
    public void run() {
      while (true){
          if (Ticket1 > 0){
              System.out.println(Thread.currentThread().getName() + "票号为:" + Ticket1);
              Ticket1--;
          }else{
              break;
          }
      }
    }
}
public class WindowTest2 {
    public static void main(String[] args) {
        Window1 window1 = new Window1();

        Thread t1 = new Thread(window1);
        Thread t2 = new Thread(window1);
        Thread t3 = new Thread(window1);

        t1.setName("线程一");
        t2.setName("线程二");
        t3.setName("线程三");

        t1.start();
        t2.start();
        t3.start();

    }
}
