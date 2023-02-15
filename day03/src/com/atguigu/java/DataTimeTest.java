package com.atguigu.java;

import org.testng.annotations.Test;

public class DataTimeTest {
   /*
   ##### Data

java.util.Date类表示特定的瞬间，精确到毫秒



> 构造器:
> Date(): 使用无参构造器创建的对象可以获取本地当前时间>Date(long date)
> 常用方法
> getTime():返回自 1970 年1月1日00:00:00 GMT 以来此 Date 对象表示的毫秒数。
> toString():把此 Date 对象转换为以下形式的 String: dow mon ddhh:mm:ss zzz yyyy 其
        中: dow 是一周中的某一天(Sun,Mon,Tue.Wed,Thu,Fri,Sat)，Zzz是时间标准。其它很多方法都过时了。
    */

    @Test
    public void test1(){
        long time = System.currentTimeMillis();
        System.out.println(time);
    }
}
