package com.atguigu.Student;

import java.util.Scanner;

public class StudentUtil {
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

    /**
        返回输入的字符串
     */
    public static String getUser(int limit ,int duan){
            String str;
            for(;;){
                str = getScan(limit);
                if (str.length() < duan || str.length() > limit){
                    System.out.println("长度不能小于" + duan + "长度不能超过" + limit + "请重新输入。");
                    continue;
                }else{
                    break;
                }
            }
            return str;
        }
        public static String getPhone(int limit,int duan){
            String str;
            for(;;) {
                str = getScan(limit);
                char[] c = new char[limit];
                c = str.toCharArray();
                if (c[0] == '0') {
                    System.out.println("首位不能出现0");
                    break;
                }
                if (str.length() < duan || str.length() > limit) {
                    System.out.println("长度不能小于" + duan +"长度不能超过" + limit + "请重新输入。");

                    for (int i = 1; i <= 11; i++) {
                        for (int j = 1; j < 10; j++) {
                            if (c[i] != (char) ('0' + 1)) {
                                System.out.println("不能有除了数字以外的出现。");
                            }
                        }
                    }
                    continue;
                } else {
                    break;
                }
            }
            return str;
        }
        public static String getPASSWDr(int limit,int duan){
            String str;
            for(;;) {
                str = getScan(limit);
                char[] c = new char[limit];
                c = str.toCharArray();
                if (str.length() < duan || str.length() > limit) {
                    System.out.println("长度不能小于" + duan+"长度不能超过" + limit + "请重新输入。");
                    for (int i = 0; i < limit; i++) {
                        for (int j = 0; i < 26; i++) {
                            if (c[i] != (char) (96 + j)) {
                                System.out.println("不能纯数字！");
                            }
                        }
                        for (int k = 1; k < 10; k++) {
                            if (c[i] != (char) ('1' + k)) {
                                System.out.println("不能纯字母！");
                            }
                        }
                    }
                    continue;
                } else {
                    break;
                }
            }
            return str;
        }
//        public static String setidu(int limit) {
//            String str = new String();
//            String s = scanner.nextLine();
//            char[] c = s.toCharArray();
//        }
        public String uid(int limit){
            String s = scanner.nextLine();
            return  s;
        }

    public boolean TFuid(String str) {
        //不能小于18位
        if (str.length() > 18 && str.length() != 18) {
            return false;
        }
        //首位部位0
        if (str.charAt(0) == '0') {
            return false;
        }
        //1-17位要位1-9
        char[] c = str.toCharArray();
        for (int i = 0; i < str.length() - 1; i++) {
            if (c[i] >= 0 && c[i] <= 9) {
                return false;
            }
        }
        //最后一位是：X-X 1-9
        char ch = str.charAt(str.length() - 1);
        if (ch == 'X' || ch == 'x' || (ch >= '0' && ch <= '9')) {
            return true;
        } else {
            return false;
        }
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