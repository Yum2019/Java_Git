package com.zym.exer;

public class CCCC {
         public char[] a = new char[53];
         public char[] b = new char[10];
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
    public String getletter(){
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
    public static void main(String[] args) {
        //设置26个大小写字母

//
//        CaptchaTest c = new CaptchaTest();
        CCCC c = new CCCC();
        String letter = new String();

        letter = c.getletter();

        System.out.println(letter);

    }
}
