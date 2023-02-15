package com.atguigu.java;

/**
     创建多线程的方式二：实现Runnable的接口
     1.创建一个实现了Runnable的接口类
     2.实现类去实现Runnable类中的run方法
     3.创建实现类的对象
     4.将此对象作为参数传递到Thread类的构造器中，创建Thread类的对象
     5.通过Thread类的调对象调用start();
     */

    //1.创建一个继承Runnable的子类
class  MThreadTest implements Runnable {
        //2.实现run()方法
        @Override
        public void run() {
            for (int i = 0; i < 100; i++) {
                if (i % 2 == 0){
                    System.out.println(Thread.currentThread().getName() + ":" +  i);
                }
            }
        }
    }
public class MThread {
    public static void main(String[]args){
        //3.创建实现类的对象
        MThreadTest MT = new MThreadTest();

        //4.将此对象作为参数传递到Thread类的构造器中，创建Thread类的对象
        Thread t1 = new Thread(MT);
        Thread t2 = new Thread(MT);
        Thread t3 = new Thread(MT);

        //改名
        t1.setName("线程一");
        t2.setName("线程二");
        t3.setName("线程三");

        //通过Thread类的调对象调用start();
        t1.start();
        t2.start();
        t3.start();


    }
}
