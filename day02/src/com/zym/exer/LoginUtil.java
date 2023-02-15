package com.zym.exer;

import java.util.Scanner;

public class LoginUtil {
    private static Scanner scanner = new Scanner(System.in);


    /**
        输入1-4选项
     */
    public static char getOption(){
        char c;
        for (;;){
            String str = getScan(1);
            c = str.charAt(0);
            if (c != '1' && c != '2' && c != '3' && c != '4'){
                System.out.println("只能输入1-4哦，请重新输入:");
            }else {
                break;
            }
        }
        return c;
    }

    /**
        是否退出。
     */
    public static char getExit(){
        char c;
        for(;;){
            String str = getScan(1);
            c = str.charAt(0);
            if (c != 'Y' && c != 'N'){
                System.out.println("只能选择Y或N哦，请重新输入：");
            }else {
                break;
            }
        }
            return c;
    }

    public static String getUser(int limit){
        String str;
        for(;;){
            str = getScan(limit);
            if (str.length() < 1 || str.length() > limit){
                System.out.println("长度不能超过" + limit + "请重新输入。");
                continue;
            }else{
                break;
            }
        }
        return str;
    }

    /**
        输入&&长度
    */
    private static String getScan(int limit){
        String str = "";
        while (scanner.hasNext()){
            str = scanner.nextLine();
            if (str.length() < 1 || str.length() > limit){
                System.out.println("长度不能超过" + limit + "请重新输入。");
                continue;
            }else{
                break;
            }
        }
        return str;
    }
}
