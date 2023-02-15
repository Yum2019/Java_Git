package com.zym.exer;

import java.util.Scanner;

public class CXCAS {
      private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        CXCAS c = new CXCAS();
        String uid = c.uid(18);
        boolean b = c.TFuid(uid);
        if (b){
            System.out.println("身份证输出格式正确！");
        }else{
            System.out.println("身份证输入格式不正确！");
        }
    }

    public String uid(int limit){
        System.out.println("请输入身份证:");
        String s = scanner.nextLine();
        return  s;
    }

    public boolean TFuid(String str){
        //不能小于18位
        if (str.length() > 18 && str.length() != 18){
            return false;
        }
        //首位部位0
        if (str.charAt(0) == '0' ){
            return false;
        }
        //1-17位要位1-9
        char[] c = str.toCharArray();
        for (int i = 0; i < str.length()-1; i++) {
            if (c[i] >=0&&c[i]<=9){
                return false;
            }
        }
        //最后一位是：X-X 1-9
        char ch = str.charAt(str.length()-1);
        if (ch == 'X' || ch == 'x' || (ch >= '0' && ch <= '9')){
            return true;
        }else {
            return false;
        }
       

    }
}
