package com.atguigu.exer;

import org.testng.annotations.Test;

import java.util.Arrays;

/*
练习5:常见算法题目
1.模拟一个trim方法，去除字符串两端的空格。
2.将一个字符串进行反转。将字符串中指定部分进行反转。比如“abcdefg”反转为abfedcg
3.获取一个字符串在另一个字符串中出现的次数比如:获取“ab”在“abkkcadkabkebfkabkskab”中出现的次数
4.获取两个字符串中最大相同子串。比如:str1 = "abcwerthelloyuiodef str2 = "cvhellobnm"
    提示:将短的那个串进行长度依次递减的子串与较长的串比较。
5.对字符串中字符进行自然顺序排序。
提示:
1字符串变成字符数组。
2对数组排序，择，冒泡，Arrays.sort().
3将排序后的数组变成字符串。
 */

public class StringExer {
    @Test
    public void test31(){
        String s1 = "ASFHSODIabcdeIOSDAFPaahellosabbhelloscchello";
        String s2 = "abcdAbcdefWWWaahellobbhellosfcchello";
        String[] maxSameString1 = getMaxSameSubString1(s1, s2);
        System.out.println(Arrays.toString(maxSameString1));
    }
    // 如果存在多个长度相同的最大相同子串
    // 此时先返回String[]，后面可以用集合中的ArrayList替换，较方便
    public String[] getMaxSameSubString1(String str1, String str2) {
        if (str1 != null && str2 != null) {
            StringBuffer sBuffer = new StringBuffer();
            String maxString = (str1.length() > str2.length()) ? str1 : str2;
            String minString = (str1.length() > str2.length()) ? str2 : str1;

            int len = minString.length();
            for (int i = 0; i < len; i++) {
                for (int x = 0, y = len - i; y <= len; x++, y++) {
                    String subString = minString.substring(x, y);
                    if (maxString.contains(subString)) {
                        sBuffer.append(subString + ",");
                    }
                }
//                System.out.println(sBuffer);
                if (sBuffer.length() != 0) {
                    break;
                }
            }
            String[] split = sBuffer.toString().replaceAll(",$", "").split("\\,");
            return split;
        }

        return null;
    }

    //5.对字符串中字符进行自然顺序排序。
    @Test
    public void test6(){
        String s = "cbasdigohdfioh";
        char ch[] = s.toCharArray();
        for (int i = 0; i < ch.length-1; i++) {
            for (int j = 0; j < ch.length-i-1; j++) {
                if ((int)ch[j] >(int)ch[j+1]){
                    char c = ch[j];
                    ch[j] = ch[j+1];
                    ch[j+1] = c;
                }
            }
        }
        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i]);
        }

    }


    @Test
    public void test5(){
        String s = "hello";
        String s1 = "hellohello";
        String substring = s.substring(3);
        String substring1 = s1.substring(3);
        System.out.println(substring);
    }
    //获取两个字符串中最大相同子串。比如:str1 = "abcwerthelloyuiodef str2 = "cvhellobnm"
    //    提示:将短的那个串进行长度依次递减的子串与较长的串比较。
    @Test
    public void test4(){
        String s = "hello";
        String s1 = "hellohello";
        char ch[] = s.toCharArray();
        char ch1[] = s1.toCharArray();
        int i = 0;
        int sum = 0;
        int sum1 = 0;

       for(;;){
           if ((int)ch[i] == (int)ch1[i]){
               if (ch.length > ch1.length){
                   sum = (int)ch[i] - (int)ch1[i];
                   System.out.println(sum);
               }
               if (ch.length < ch1.length){
                   sum = (int)ch[i] - (int)ch1[i];
                   System.out.println(sum);
               }
           }
           i++;
           if (i == ch.length){
               break;
           }
       }
    }

    //3.获取一个字符串在另一个字符串中出现的次数比如:获取“ab”在“abkkcadkabkebfkabkskab”中出现的次数
    @Test
    public void test3(){
         String str = new String("abcdabcdabcdabcdab");
        int ab = number(str, "ab");
        System.out.println(ab);
    }
    public int number(String str,String str1){
        int k=0,i=0,k1=0;
        char[] chars = str.toCharArray();
        char[] chars1 = str1.toCharArray();

        for (k = 0;k < chars.length;k++) {
            if (chars[k] == chars1[0]) {
                for (int j = 0; j < chars.length-1; j++) {
                    if (chars[k+j] == chars1[j]){
                        if (j == chars1.length-1){
                            k1++;
                            break;
                        }
                    }else {
                        continue;
                    }
                }
            }
        }
        return k1;
    }

    //2.将一个字符串进行反转。将字符串中指定部分进行反转。比如“abcdefg”反转为abfedcg
    @Test
    public void test2(){
        String str1 = new String("123456");
        String rollback = rollback(0, 2, str1);
        System.out.println(rollback);
    }
    public String rollback(int x,int y,String str){
        char []c = str.toCharArray();
        int index = 0;
      if (y%2==0){
          for (int i = x; i < y-1; i++) {
              char cc = c[x];
              c[x] = c[y - index];
              c[y - index] = cc;
              index++;
          }
      }
        if (y%2!=0){
            for (int i = x; i < y; i++) {
                char cc = c[x];
                c[x] = c[y - index];
                c[y - index] = cc;
                index++;
            }
        }
        return new String(c);
    }

    //1.模拟一个trim方法，去除字符串两端的空格。
    @Test
    public void test1(){
        StringExer s = new StringExer();
        String str1 = "  AA BB ";
        char[] chars = str1.toCharArray();
        String s1 = s.test1(str1);
        System.out.println(s1);
    }
    public String test1(String str) {
    char []ch = str.toCharArray();
    int i = 0;
        for (;;) {
            if (ch.length - i == 32) {
                i++;
            }else {
                break;
            }
        }
        int q = 0;
        for (;;) {
            if (ch[q] == 32) {
                q++;
            }else {
                break;
            }
        }
        char []c = new char[ch.length-(q+i)-1];
        int index = 0;
        for (int j = q; j < (ch.length-i)-1; j++) {
            c[index] = ch[j];
            index++;
        }
        return new String(c);
    }
}
