package com.atguigu.java;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

public class ForeachTest {
    @Test
    public void test3(){
        String []str = {"GG","GG"};
       //如果=使用之前的for循环会对原有的值进行一个重新赋值。所以循环出啦的值是MM
//        for (int i = 0; i < str.length; i++) {
//            str[i] = "MM";
//        }
     //如果是使用foreach的话那么取出来的值是MM然后赋给了新的局部变量 s ,于是原来的变量str还是GG
        for (String s : str) {
            s = "MM";
        }
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }


    }

    @Test
    public void test2(){
        Collection c1 = new ArrayList();
        c1.add(123);
        c1.add(456);
        c1.add(789);
        for(Object obj : c1){
            System.out.println(obj);
        }
    }

    @Test
    public void test1(){
        int []arr = new int[]{1, 2, 3, 4, 5};
        for(int k : arr){
            System.out.println(k);
        }
    }


}
