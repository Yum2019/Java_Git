package com.atguigu.java;

import org.testng.annotations.Test;

public class StringBufferBuilderTest {
    /**
     StringBuffer的常用方法:
     StringBuffer append(xxx): 提供了很多的append()方法，用于进行字符串拼接
     StringBuffer delete(int start,int end): 删除指定位置的内容
     StringBuffer replace(int start, int end, String str): start,end)位置替换为str
     StringBuffer insert(int offset，xxx): 在指定位置插入xxx
     StringBuffer reverse(): 把当前字符序列逆转
     public int indexof(string str)
     public String substring(int start,int end)
     public int length()
     public char charAt(int n )
     public void setCharAt(int n ,char ch)

            增：append
            删：delete
            改：replace、setCharAt
            查：charAt
            长度：length
            遍历：toString().toCharArray()
     */
    @Test
    public void test2(){
        //StringBuffer append(xxx): 提供了很多的append()方法，用于进行字符串拼接
        StringBuffer sb1 = new StringBuffer("ABC");
        sb1.append(1);
        sb1.append('1');
        System.out.println(sb1);
        System.out.println("***********");
        //StringBuffer delete(int start,int end): 删除指定位置的内容,是左开右弼的(0，3];
//        sb1.delete(0,3);
//        //StringBuffer replace(int start, int end, String str): start,end)位置替换为str,是左开右弼的(0，3];
//        sb1.replace(0,3,"efg");
        //StringBuffer insert(int offset，xxx): 在指定位置插入xxx
//        sb1.insert(3,123);
        //StringBuffer reverse(): 把当前字符序列逆转
//        sb1.reverse();
        //     public int indexof(string str)
//        int i = sb1.indexOf("1");
//        System.out.println(i);
        //public String substring(int start,int end)
//        CharSequence charSequence = sb1.subSequence(0, 3);
//        System.out.println(charSequence);
        //public void setCharAt(int n ,char ch)
//        sb1.setCharAt(3,'K');
        System.out.println(sb1);
        

    }


    @Test
    public void test1(){
        StringBuffer sb1 = new StringBuffer("abc");
        sb1.setCharAt(0,'A');
        System.out.println("修改后的sb1：" + sb1);
        //可以发现sb1改变了，所以StringBuffer是可以变的。
    }

}
