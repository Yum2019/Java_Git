package com.atguigu.java2;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

class Number implements Callable{
    private int sum = 0;
    @Override
    public Object call() throws Exception {
        for (int i = 1; i < 100; i++) {
            if (i % 2 == 0){
                sum += i;
            }
        }
        return sum;
    }
}

public class FutrueTaskTest {
    public static void main(String[] args) {
        Number number = new Number();
        FutureTask futureTask = new FutureTask(number);
        Thread thread = new Thread(futureTask);
        thread.start();
        try {
            Object o = futureTask.get();
            System.out.println(o);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}
