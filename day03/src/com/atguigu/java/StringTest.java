package com.atguigu.java;

import org.testng.annotations.Test;

public class StringTest {

/*
       比较
       1、所有字面量都会从常量池中的文字常量区中寻找一个相同的，并指向它。如果没有就new一个char数组存储
       2、但凡在 String S5 = S3 + "HADOOP"; 赋值中出现变量S3这种，那么找的（指向）的都是堆空间new出来的哪一个对象，所以不相等
       3、String.intern() --> 这个方法会让对象只返回指向常量池中的字面量，所以即使赋值中包含了变量也会相等，因为比较的是字面量！
 */
    @Test
    public void test3(){
        String S1 = "JAVAEEHADOOP";
        String S2 = "JAVAEE" + "HADOOP";
        String S3 = "JAVAEE";
        String S4 = "HADOOP";
        String S5 = S3 + "HADOOP";
        String S6 = S3 + S4;
        String S7 = S6.intern();
        System.out.println(S1 == S2);    //true
        System.out.println(S5 == S1);   //false
        System.out.println(S6 == S1);   //false
        System.out.println(S7 == S1);   //true

    }



    /*
        s1 = "abc" 和 String s2 = new String(String abc); 的区别
     */
    @Test
    public void test2(){
        /**
            1、s1和s2相等是因为他们是在栈内指向字符串文字常量区的同一个char型数组。
            2、s3和s4不相等是因为他们是在对空间中new出来的地址，栈指向空间的地址，所以有两个地址，并不相等
                 所以即使他们在堆中即使指向文字常量区的字面量一样，但是比较的确实他们的地址。
                **** 重点： s1指向的是常量池中的abc的地址，于是将abc的地址赋值给了s1
                ****       s3指向的堆空间中new出来的对象的地址值，于是堆空间new出来的对象将地址赋给了s3，但是同时堆空间中new出来的
                             对象指向的是常量池中的abc的地址，于是abc把地址赋给了栈空间s3在堆空间new出来的对象，于是堆空间存的是abc的
                                 地址值。

         */
        String s1 = "JAVAEE";
        String s2 = "JAVAEE";
        System.out.println(s1 = s2);
        System.out.println("***************");
        String s3 = new String("JAVAEE");//false
        String s4 = new String("JAVAEE");//false
        //NO s3 != s4
        if (s3 == s4){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
        System.out.println("************");
        //NO s1 != s3
        if (s1 == s4){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
        System.out.println("************");
        //NO s1 != s3
        if (s1 == s3){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
        System.out.println("************");
        Person p1 = new Person(18,"Tom1");
        Person p2 = new Person(18,"Tom1");
        if (p1 == p2){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
        //此时比较的是字面量。于是是相等的
        System.out.println(p1.equals(p2));
        System.out.println(p1.getName()==p2.getName());
    }
    /*
        String:字符串，使用一对“”包起来。
        1.String声明位final的，不可被继承
        2.String实现了Serializeable接口：表示字符串是支持序列化的。
                实现了Comparable接口：表示String可以比较大小的。
        3.String内部定义了final char[] value用于存储字符串数据
        4.String的类型名s1存放再（栈）里，当s1指向（“abc”）的时候，会在文字常量区寻找
                是否有（“abc”）这么一个字面量，如果没有，那么就开new一串“abc”
        5。System.out.printf(s1 = s2); //true
            因为文字常量区已new了一串"abc"，那么s2便会指向文字常量区已经new出来 “abc”
        6.System.out.println(s2); //abc
          System.out.println(s3); //abcdef
            s2不会因为s3在“abc”的后面加上“def”就改变（体现了char的final性）
            s3会在“abc”的基础上加上“def”在文字常量区new一个空间，变成“acbdef”
        7.System.out.println(s4); //'abc'
          System.out.println(s5); //'Abc'
            再次体现了String中char的final（不可变性）。
     */

    @Test
    public void test1(){
        String s1 = "abc";
        String s2 = s1;
        System.out.printf(s1 = s2); //true;
        System.out.println("*********************");
        String s3 = s2;
        s3 += "def";
        System.out.println(s2); //abc
        System.out.println(s3); //abcdef
        System.out.println("*********************");
        String s4 = "abc";
        String s5 = s4.replace('a', 'A');
        System.out.println(s4); //'abc'
        System.out.println(s5); //'Abc'
    }
}
