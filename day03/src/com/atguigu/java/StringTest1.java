package com.atguigu.java;

import org.testng.annotations.Test;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class StringTest1 {
    /**
        String --> byte[]
        byte[] --> String
     */
    @Test
    public void test3() throws UnsupportedEncodingException {
        String str1 = "Hello你好";
        byte[] bytes = str1.getBytes();
        System.out.println("String : "+str1);
        System.out.println("**********************************");
        System.out.println("将str1转化为字节流");
        System.out.println(Arrays.toString(bytes));
        System.out.println("将str1编码为（gbk编码集的）字节流");
        byte[] gbks = str1.getBytes("gbk");
        System.out.println(Arrays.toString(gbks));
        System.out.println("**********************************");
        System.out.println("将编码后的byte重新转化为String类型");
        String str2 = new String(bytes);
        System.out.println("默认的---：" +str2);
        System.out.println("如果之前修改过默认编译码的话，解码要设置为之前设置过的编码集，否则会乱码：");
        String str4 = new String(gbks);
        System.out.println("默认的---：" +str4);
        String str3 = new String(gbks, "gbk");
        System.out.println("gbk的---：" +str3);
    }

    /**
        1. String --> char[]
        2. char[] --> String
     */
    @Test
    public void test2(){
        String str1 = "Hello";
        char[] chars = str1.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
        System.out.println("============");
        char[] ch = new char[]{'H','E','L','L','O','D'};
        String str2 = new String(ch);
        System.out.println(str2);
    }


    /**
       1. String --> 基本数据类型 String --> 包装类
       2. 基本数据类型 --> String
     */
    @Test
    public void test1(){
        //1.
        String str1 = "123";
        int number = Integer.parseInt(str1);
        System.out.println(number);
        //2.
        int num = 123;
        String s = String.valueOf(num);
        System.out.println(s);
    }
}
