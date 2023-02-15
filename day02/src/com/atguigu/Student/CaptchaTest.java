package com.atguigu.Student;

import java.util.Random;

/**
 随机生成验证码
 */
public class CaptchaTest {
    public String verifyCode() {
        char[] arr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
                'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N',
                'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
                'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n',
                'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        Random random = new Random();
        String code = "";
        for (int i = 0; i < 6; i++) {
            //随机生成一个整数，值域 [0, arr.length)
            int index = random.nextInt(arr.length);
            code += arr[index];
        }
        return code;
    }
}
//        String str = verifyCode();
//
//    public void yunx(){
//        System.out.println(str);
//        Scanner scanner = new Scanner(System.in);
//        String s = scanner.nextLine();
//        boolean cc = cc(s);
//        if (cc){
//            System.out.println("1");
//        }else {
//            System.out.println("2");
//        }
//    }
//    public boolean cc(String s){
//        if (s.equals(str)){
//            return true;
//        }else {
//            return false;
//        }
//    }
//
//    public static void main(String[] args) {
//        CaptchaTest c = new CaptchaTest();
//        c.yunx();
//    }



//    public char[] a = new char[53];
//    public char[] b = new char[10];
//
//    //设置26个大小写字母
//    public void setLetter() {
//        for (int i = 1; i < 10; i++) {
//            b[i] = (char) (46 + i);
////            System.out.print(b[i]);
//        }
//        for (int i = 1; i <= 26; i++) {
//            a[i] += (char) (96 + i);
//        }
//        for (int i = 1; i <= 26; i++) {
//            a[26 + i] += Character.toUpperCase((char) (96 + i));
//        }
//    }
//    public String getletter () {
//                char[] cha = new char[6];
//                for (int i = 0; i < 6; i++) {
//                    int index = (int) (Math.random() * a.length);
//                    cha[i] = a[index];
//                }
//
//                int index = (int) (Math.random() * b.length);
//                int index2 = (int) (Math.random() * 6);
//                cha[index2] = b[index];
//                String str = new String(cha);
//                return str;
//            }
//

