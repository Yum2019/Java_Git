package com.atguigu.exer;

import org.testng.annotations.Test;

import java.util.Arrays;

public class StringExer2 {
    //获取两个字符串中最大相同子串。比如:str1 = "abcwerthelloyuiodef str2 = "cvhellobnm"
    //提示:将短的那个串进行长度依次递减的子串与较长的串比较。
    @Test
    public void test5(){
        String s1 = "ASFHSODIabcdeIOSDAFPaahellosabbhelloscchelloasfbbhellos";
        String s2 = "abcdAbcdefWWWaahellobbhellosfcchelloaashfoicchellos";
        String[] maxSameString1 = getMaxSameString1(s1, s2);
        System.out.println(Arrays.toString(maxSameString1));
    }
    public String[] getMaxSameString1(String str1,String str2) {
        if (str1 != null && str2 != null) {
            StringBuffer sb1 = new StringBuffer();
            String maxString = (str1.length() > str2.length()) ? str1 : str2;
            String minString = (str1.length() > str2.length()) ? str2 : str1;

            int len = minString.length();
            for (int i = 0; i < len; i++) {
                for (int j = 0, y = len - i; y <=len; j++, y++) {
                    String substring = minString.substring(j, y);
                    if (maxString.contains(substring)) {
                        sb1.append(substring + ",");
                    }
                }
                if (sb1.length() != 0) {
                    break;
                }
            }
            String[] split = sb1.toString().replaceAll(",$", "").split("\\,");
            return split;
        }
        return null;
    }

    //3.获取一个字符串在另一个字符串中出现的次数比如:获取“ab”在“abkkcadkabkebfkabkskab”中出现的次数
    @Test
    public void test2(){
        String s = "ashfosdfababababab";
        String s1 = "ab";
        int count = getCount(s, s1);
        System.out.println(count);
    }
    public int getCount(String str,String str2){
        int count = 0;
        int index = 0;
        int str2length = str2.length();
        int c;
        if (str.length()>=str2.length()){
            while ((index = str.indexOf(str2,index))!=-1){
                index += str2length;
                count++;
            }
        }else {
            return 0;
        }
        return count;
    }

    //反转截取的某一段字符串
    @Test
    public void test1(){
        String s1 = "123456";
        String reverse = reverse2(s1, 0, 5);
        System.out.println(reverse);
    }
    //方法一
    public String reverse(String str,int start,int end){
        char ch[] = str.toCharArray();
        for (int i = start,k = end; i < k; i++,k--) {
            char c = ch[i];
            ch[i] = ch[k];
            ch[k] = c;
        }
        return new String(ch);
    }
    //方法二  1.截取  2.破解 3.返回
    public String reverse1(String str,int start,int end){
        String s1 = str.substring(0,start);
        char ch[] = str.toCharArray();
        for (int i = end; i >= start; i--) {
            s1 += ch[i];
        }
        s1 += str.substring(end+1);
        return s1;
    }
    //方法三 速度快内存占用小  1.截取  2.破解 3.返回
    public String reverse2(String str,int start,int end){
        StringBuffer s1 = new StringBuffer(str.length());
        char ch[] = str.toCharArray();
        s1.append(str.substring(0,start));
        for (int i = end; i >= start; i--) {
            s1.append(ch[i]);
        }
        s1.append(s1.substring(end + 1));
//        return new String((s1));
        return s1.toString();
    }

}
