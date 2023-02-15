package com.atguigu.exer;

class Account1{
    private static double banlance;
    //通过客户类设置每次存放多少钱
    public Account1(double banlance){
        Account1.banlance = banlance;
    }
    public double getBanlance(){
        return banlance;
    }
    //存钱方法
    public synchronized void deposit(double save){
        if(save > 0){
            banlance += save;
            System.out.println(Thread.currentThread().getName() + ":存进了" + save + "元，余额为：" + banlance);
        }
    }
}

class count extends Thread {
    private Account1 account;
    public count(Account1 account){
        this.account = account;
    }
    final static Object obj = new Object();
    @Override
    public void run() {
        synchronized (obj) {
            while (true) {
                if (account.getBanlance() >= 3000) {
                    break;
                }else{
                    account.deposit(1000);
                }
            }
        }
    }
}

public class AccountTest1 {
    public static void main(String[] args) {
        Account1 account1 = new Account1(0);
        count t1 = new count(account1);
        count t2 = new count(account1);
        t1.setName("甲");
        t2.setName("乙");

        t1.start();
        t2.start();

    }
}
