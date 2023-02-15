package com.atguigu.java;

class Window implements Runnable{
    private int ticket = 100;
    final Dog dog = new Dog();
    @Override
    public void run() {
        while (true){
        synchronized (dog) {
            if (ticket > 0) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(Thread.currentThread().getName() + "，票号:" + ticket);
                ticket--;
            } else {
                break;
            }
        }
        }
    }
}

public class WindowTest1 {
    public static void main(String[] args) {
        Window w = new Window();
        Thread t1 = new Thread(w);
        Thread t2 = new Thread(w);
        Thread t3 = new Thread(w);

        t1.setName("线程一");
        t2.setName("线程二");
        t3.setName("线程三");

        t1.start();
        t2.start();
        t3.start();
    }
}

class  Dog{

}
