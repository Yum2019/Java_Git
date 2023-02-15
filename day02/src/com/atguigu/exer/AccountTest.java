package com.atguigu.exer;

/**
    银行有一个账户
    有两个储户分别向同一个账户存3000元，每次存1000，存3次，每次存完打印账户余额
 */
class  Account implements Runnable{
    private static double amount = 0;
    private double banlance = 1000;
    @Override
    public void run() {
       while (true){
           synchronized (Account.class) {
               if (amount < 3000) {
                   amount += banlance;
                   System.out.println(Thread.currentThread().getName() + "客户存入了:" + banlance);
               }else{
                   break;
               }
           }
       }
    }
}

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account();

        Thread a1 = new Thread(account);
        Thread a2 = new Thread(account);

        a1.setName("客户一：");
        a2.setName("客户二：");

        a1.start();
        a2.start();

    }
}
