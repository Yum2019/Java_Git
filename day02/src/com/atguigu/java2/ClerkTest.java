package com.atguigu.java2;

class Clerk{
    private int productCount = 0;

    public synchronized void producer(){
        if (productCount < 20){
            productCount++;
            System.out.println(Thread.currentThread().getName() + "生产了第：" + productCount + "个产品");
            notify();
        }else {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public synchronized void consume(){
        if (productCount > 0){
            System.out.println(Thread.currentThread().getName() + "生产了第：" + productCount + "个产品");
            productCount--;
            notify();
        }else {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}

//生产者线程
class producer extends Thread{
    private Clerk clerk;
    public producer(Clerk clerk){
        this.clerk = clerk;
    }

    @Override
    public void run() {
        System.out.println("开始生产产品...");
        while (true){
            try {
                sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            clerk.producer();
        }
    }
}
//消费者线程
class consume extends Thread{
    private Clerk clerk;
    public consume(Clerk clerk){
        this.clerk = clerk;
    }

    @Override
    public void run() {
            System.out.println("开始消费产品...");
        while (true){
            try {
                sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            clerk.consume();
        }
    }
}

public class ClerkTest {
    public static void main(String[] args) {
        Clerk c = new Clerk();
        producer producer1 = new producer(c);
        consume consume1 = new consume(c);
        consume consume2 = new consume(c);

        producer1.setName("生产者1号");
        consume1.setName("消费者1号");
        consume2.setName("消费者2号");

        producer1.start();
        consume1.start();
        consume2.start();

    }

}
