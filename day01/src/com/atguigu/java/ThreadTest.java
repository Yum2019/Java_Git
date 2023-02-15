package com.atguigu.java;

/**
    多线程的创建，方式一：继承于Thread类
    1.创建一个继承于Thread类的子类
    2.重写Thread类的run()
    3.创建Thread类子类的对象
    4.通过此对象去调用start()
 -------------------------------
    例子：
        遍历100以内的所有偶数
 -------------------------------
    二、线程的优先级
    1.
    Thread.MAX_PRIORITY 10
    Thread.MIN_PRIORITY 1
    默认为 5

 */
//1.创建一个继承Thread类的子类
class MyThread extends Thread{
    //2.重写父类的run方法
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(i % 2 == 0){
                System.out.println(Thread.currentThread().getName() + ":" + Thread.currentThread().getPriority() + ":" + i);
            }
        }
    }
}

public class ThreadTest {
    public static void main(String[] args) {
        //3创建继承于Thread的子类
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        //4.调用对象的start(): ① 启动当前线程 ② 调用当前线程的run()
        //t1.start();

        //跳转优先级
        t2.setPriority(Thread.MAX_PRIORITY);
        Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
        t2.start();

        //如下操作仍然是再main线程中执行的，在用t1.start(); 之前都是用main主线程干的活。
        for (int i = 0; i < 100; i++) {
            if(i % 2 != 0){
                System.out.println(Thread.currentThread().getName() + ":" + Thread.currentThread().getPriority() + ":" + i);
            }
        }
    }
}