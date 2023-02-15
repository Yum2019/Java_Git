package com.atguigu.java1;
/**
    使用2个线程通信执行1~100的交替打印
 */
class print implements Runnable{
    private static int i = 1;
    @Override
    public synchronized void run() {
        while (true){
            notify();
            if (i <= 100){
                System.out.println(Thread.currentThread().getName() + "打印了:" + i);
                i++;
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }else{
                break;
            }
        }
    }
}
public class CommuicationTest {
    public static void main(String[] args) {
        print print = new print();
        Thread t1 = new Thread(print);
        Thread t2 = new Thread(print);
        t1.setName("线程一：");
        t2.setName("线程二：");

        t1.start();
        t2.start();

    }

}
