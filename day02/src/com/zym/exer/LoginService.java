package com.zym.exer;

import com.atguigu.Student.CaptchaTest;

import java.util.Arrays;
import java.util.Objects;

public class LoginService {
    CaptchaTest c1 = new CaptchaTest();
    private String []user = new String[3];
    private String []passwd = new String[3];

    public void setUser(){
        int total = 0;
        for (int i = 0; i < user.length; i++) {
            if (user[i] == null){
                System.out.println("请输入账号");
                user[i] = LoginUtil.getUser(10);
                System.out.println(user[i]);
                System.out.println("请输入密码：");
                passwd[i] = LoginUtil.getUser(10);
                System.out.println(passwd[i]);
                System.out.println("注册成功！");
                break;
            }else {
                total++;
                continue;
            }
        }
        if (total >= 2){
            System.out.println("注册的用户已满！");
        }
    }
    public void login(){
        System.out.println("请输入你的账号：");
        String str = LoginUtil.getUser(10);
        for (int i = 0; i < user.length; i++) {
            if (str.equals(user[i])) {
                System.out.println("请输入你的密码：");
                String str1 = LoginUtil.getUser(10);
                if (str1.equals(passwd[i])){
                    String str5 = getletter();
                    System.out.println(str5);
                    String str2 = LoginUtil.getUser(6);
                    if (str2.equals(str5)){
                    System.out.println("登陆成功！");
                    break;
                    }else{
                        continue;
                    }
                }else {
                    System.out.println("密码错误，请重新输入:");
                }
            }else{
                System.out.println("没有该用户，请重新输入：");
            }
        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LoginService that = (LoginService) o;
        return Objects.equals(c1, that.c1) && Arrays.equals(user, that.user) && Arrays.equals(passwd, that.passwd);
    }



    public  char[] a = new char[53];
    public  char[] b = new char[10];
    //设置26个大小写字母
    public void setLetter(){
        for (int i = 1; i < 10; i++) {
            b[i] = (char)('0'+i);
//            System.out.print(b[i]);
        }
        for (int i = 1; i <= 26; i++) {
            a[i] += (char)(96+i);
        }
        for (int i = 1; i <= 26; i++) {
            a[26+i] += Character.toUpperCase((char)(96+i));
        }
//        System.out.println("\n这是26个大小写字母");
//        for (int i = 1; i <= 52; i++) {
//            System.out.print(a[i]);
//        }
    }

    /**
     * 随机生成的验证码
     */
    private String getletter(){
        char []cha = new char[6];
        System.out.print("验证码:");
        for (int i = 0; i < 6; i++) {
            int index = (int)(Math.random() * a.length);
            cha[i] = a[index];
        }
        for (int i = 0; i < 1; i++) {
            int index = (int)(Math.random() * b.length);
            int index2 = (int)(Math.random() * 6);
            cha[index2] = b[index];
        }
        String str = new String(cha);
        System.out.println(str);
        return str;
    }

//    public static void main(String[] args) {
//        CaptchaTest c = new CaptchaTest();
//        c.setLetter();
//        c.getletter();
//
//    }
}

