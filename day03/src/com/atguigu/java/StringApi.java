package com.atguigu.java;

import org.testng.annotations.Test;


public class StringApi {
    /*
- String replace(char oldChar, char newChar): 返回一个新的字符串，它是通过用 newChar 替换此字符串中出现的所有 oldchar 得到的。
- String replace(CharSequence target, CharSequence replacement): 使用指定的
        字面值替换序列替换此字符串所有匹配字面值目标序列的子字符串。
- String replaceAll(String regex，String replacement) :  使用给定的replacement 替换此字符串所有匹配给定的正则表达式的子字符串。
- String replaceFirst(String regex，String replacement) : 使用给定的replacement 替换此字符串匹配给定的正则表达式的第一个子字符串。
- boolean matches(String regex):告知此字符串是否匹配给定的正则表达式
- String[] split(String regex):根据给定正则表达式的匹配拆分此字符串。
- String[] split(String regex, int limit): 根据匹配给定的正则表达式来拆分此字符串，最多不超过limit个，如果超过了，
        剩下的全部都放到最后一个元素中
     */

    @Test
    public void test3(){

    }



    /*
     - boolean endsWith(String suffix): 测试此字符串是否以指定的后缀结束boolean - startsWith(String prefix):
测试此字符串是否以指定的前缀开始
    - boolean startsWith(String prefix, int toffset): 测试此字符串从指定索引开始的子字符串是否以指定前缀开始
当且仅当此字符串包含指定的 char 值序列
    - boolean contains(CharSequence s):时，返回 true
    - int indexOf(String str): 返回指定子字符串在此字符串中第一次出现处的索引
    - int indexOf(String str, int fromindex):
返回指定子字符串在此字符串中第一次出现处的索引，从指定的索引开始
    - int lastlndexOf(String str): 返回指定子字符串在此字符串中最右边出现处的索引
    - int lastlndexOf(String str, int fromindex): 返回指定子字符串在此字符串中最后次出现处的索引，
从指定的索引开始反向搜索注: indexOf和lastlndexOf方法如果未找到都是返回-1
     */
    @Test
    public void test2(){
        String s1 = "Helloworld";
        System.out.println("===================================================");
        System.out.println("測試字符串是否以xx为结尾");
        boolean ld = s1.endsWith("ld");
        System.out.println(ld);
        System.out.println("===================================================");
        System.out.println("测试此字符串从指定索引开始的子字符串是否以指定前缀开始");
        boolean ll = s1.startsWith("ll", 2);
        System.out.println(ll);
        System.out.println("===================================================");
        System.out.println("检测是否有这个字符");
        boolean hello = s1.contains("Hello");
        System.out.println(hello);
        System.out.println("===================================================");
        System.out.println("测试字符串从第x位开始第一次出现的位置（没有则返回-1）");
        int indexOf = s1.indexOf('q');
        System.out.println(indexOf);
        System.out.println("===================================================");
        System.out.println("检测从第几位开始，是否有xxx字符");
        int world = s1.indexOf("ld", 5);
        System.out.println(world);
        System.out.println("===================================================");
        String s2 = "iiiHelliiolHeiilloHello";
        System.out.println("从第0位开始到那个字符出现的最后一个位置");
        int lastOf = s2.lastIndexOf("H");
        System.out.println(lastOf);
        System.out.println("===================================================");
        System.out.println("搜素H，从第0位到指定的索引位末尾");
        int h = s2.lastIndexOf("H", s2.length());
        System.out.println(h);
    }


    /*
    - int length(): 返回字符串的长度: return value.lengthchar
    - charAt(int index): 返回某索引处的字符return value[index]
    - boolean isEmpty(): 判断是否是空字符串: return value.length == 0
    - string toLowerCase(): 使用默认语言环境，将 String 中的所有字符转换为小写- - String toUpperCase(): 使用默认语言环境，
        将 String 中的所有字符转换为大写
     - String trim(): 返回字符串的副本，忽略前导空白和尾部空白
    - boolean equals(object obj): 比较字符串的内容是否相同
    - boolean equalslgnoreCase(String anotherString): 与equals方法类似，忽略大小写
    - String concat(String str): 将指定字符串连接到此字符串的结尾。 等价于用“+’int compareTo(String anotherString):
        比较两个字符串的大小
    - String substring(int beginlndex): 返回一个新的字符串，它是此字符串的从- - - beginIndex开始截取到最后的一个子字符串。
    - String substring(int beginlndex,int endlndex) : 返回一个新字符串，
        它是此字符串从beginlndex开始截取到endlndex(不包含)的一个子字符串。
     */
    @Test
    public void test1(){
        //判断字符串的长度
        System.out.println("判断字符串的长度");
        String s1 = "aBc";
        String s2 = "Abc";
        System.out.println(s1.length());
        //取string中char数组的第几个
        System.out.println("\n取string中char数组的第几个");
        System.out.println(s1.charAt(0));
        //判断字符是否位空？
        System.out.println("\n判断字符是否位空？");
        boolean isempty = s1.isEmpty();
        System.out.println(isempty);
        //将字符串转化位小写
        System.out.println("\n将字符串转化位小写");
        String s3 = s1.toLowerCase();
        System.out.println(s1);
        System.out.println(s3);
        //将字符串转化位大写
        System.out.println("\n将字符串转化位大写");
        String s4 = s2.toUpperCase();
        System.out.println(s2);
        System.out.println(s4);
        //比较两个字符串是否相等（区分大小写）
        System.out.println("\n比较两个字符串是否相等（区分大小写）");
        System.out.println(s1.equals(s2));
        //比较两个字符串是否相等（不区分大小写）
        System.out.println("\n比较两个字符串是否相等（区分大小写）");
        System.out.println(s1.equalsIgnoreCase(s2));
        // 将指定字符串连接到此字符串的结尾。 等价于用“+’int compareTo(String anotherString): 比较两个字符串的大小
        System.out.println("\n将指定字符串连接到此字符串的结尾。 等价于用“+’int compareTo(String anotherString):" +
                " 比较两个字符串的大小");
        String s5 = s3.concat("def");
        System.out.println(s5);
        //对比两个字符串的谁大谁先
        System.out.println("对比两个字符串的谁大谁先");
        int number = s3.compareToIgnoreCase(s5);
        System.out.println(number);
        //从字符串的第几个开是截取到末尾
        System.out.println("\n从字符串的第几个开是截取到末尾");
        String s6 = "广东省汕头市陇田镇潮南区";
        String substring1 = s6.substring(3);
        System.out.println(substring1);
        //从字符串的第几个开是截取到第几个 -->  取（左闭右开[3,6)）
        System.out.println("\n从字符串的第几个开是截取到第几个 -->  取（左闭右开[3,6)）");
        String substring2 = s6.substring(3, 6);
        System.out.println(substring2);
        //忽略前后的空白
        System.out.println("\n忽略前后的空白");
        String s7 = "  AB CD EF G  ";
        String trim = s7.trim();
        System.out.println(trim);
        //忽略所以空格，中间空格，首尾
        System.out.println("\n忽略所以空格，中间空格，首尾");
        String replaceAll11 = s7.replaceAll(" ", "");
        System.out.println(replaceAll11);
        //忽略绝大部分空白字符，但不包括转义空格符号
        System.out.println("\n忽略绝大部分空白字符，但不包括转义空格符号");
        String s8 = "  AB\tCD\tEF\tG  ";
        String replaceAll12 = s8.replaceAll("\\t", "");
        System.out.println(replaceAll12);
    }
}
