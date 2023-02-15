package com.atguigu.java2;


import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
class Exec implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0){
                System.out.println(Thread.currentThread().getName() + "：偶数:" + i);
            }
        }
    }
}
class Exec2 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0){
                System.out.println(Thread.currentThread().getName() + "：奇数:" + i);
            }
        }
    }
}

public class ExecutorService {
    public static void main(String[] args) {
       //创建线程池的最大现场数量：
        java.util.concurrent.ExecutorService executorService = Executors.newFixedThreadPool(10);
        //System.out.println(executorService.getClass());
        ThreadPoolExecutor service1 = (ThreadPoolExecutor) executorService;
        //创建线程池的最大现场数量：
        service1.setCorePoolSize(15);
        //执行任务，无返回值
        service1.execute(new Exec());
        service1.execute(new Exec());
        service1.execute(new Exec2());
        service1.shutdown();

    }
}
