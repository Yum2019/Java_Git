package com.atguigu.java;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DataTimeTest {
    @Test
    public void testSimpleDateFormat() throws ParseException {
        //无参构造器 --> SimpleDateFormat
        SimpleDateFormat sdf = new SimpleDateFormat();
        Date date = new Date();
        System.out.println(date);
        String format = sdf.format(date);
        System.out.println(format);
        //有参构造器，常用 --> SimpleDateFormat("yyyy-MM-dd hh:mm--ss");
        // 1.格式化
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String format1 = sdf1.format(date);
        System.out.println(format1);
        //解析。
        Date parse = sdf1.parse("2023-01-08 11:27:30");
        System.out.println(parse);


    }

    /**
     练习:
        将字符串”2022-09-09“转成java.sql.date
     */
    @Test
    public void test2() throws ParseException {
        String str = "2022-09-09";
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        //解析
        Date parse1 = sdf1.parse(str);
        System.out.println(parse1);
        //格式化java.sql.date
        java.sql.Date date = new java.sql.Date(parse1.getTime());
        System.out.println(date);
    }
    @Test
    public void test3() throws ParseException {
        //解析
        String s1 = "1990-01-01";
        String s2 = "2020-07-28";
        Date date = new Date();
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        Date parse1 = sdf1.parse(s1);
        Date parse2 = sdf1.parse(s2);
        long l1 = parse2.getTime() - parse1.getTime();
        long Five = 432000000;
        //将毫秒差转化为天数 除以一天的毫秒
        int sum = (int) (l1 / 86400000) + 1;
        System.out.println(sum);
        //做判断。
        if (sum % 5 == 1 || sum % 5 == 2 || sum % 5 == 3) {
            System.out.println("三天打鱼");
        } else if (sum % 5 == 4 || sum % 5 == 0) {
            System.out.println("晒网");
        }
    }

    /**
     9.2JDK8之前日期时间API
     java.util.Calendar(日历)类
     Calendar是一个抽象基类，主用用于完成日期字段之间相互操作的功能
     获取Calendar实例的方法
     使用Calendar.getlnstance()方法Y> 调用它的子类GregorianCalendar的构造器
     Obiect - iavalangOA Calendar - java.util
     CGregorianCalendar - java.utilBuddhistCalendar - sun.uti
     一个Calendar的实例是系统时间的抽象表示，通过get(int field)方法来取得想要的时间信息。比如YEAR、MONTH、DAY_OF_WEEK、HOUR OF_DAYMINUTE、SECOND
     > public void set(int field,int value)
     >
     > public void add(int field,int amountpublic final Date getTime()
     >
     > public final void setTime(Date date)
     >
     > 注意:
     > 获取月份时:一月是0，二月是1，以此类推，12月是11
     > 获取星期时:周日是1，周二是2 ， 。。。。周六是7
     */



//        Calendar instance = Calendar.getInstance();
//        instance.set(i4,i2);
//        int i = instance.get(Calendar.DAY_OF_YEAR);
//        System.out.println(i);


    public static void main(String[] args) throws ParseException {
        String s1 = "1990-12-12";
        String s2 = "2020-09-08";
        Date date = new Date();
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy");
        Date parse1 = sdf1.parse(s1);
        Date parse2 = sdf1.parse(s2);
//        Scanner sc = new Scanner(System.in);
//        System.out.print("请输入年份：");
//        int year1 = sc.nextInt();
//        System.out.print("请输入月份：");
//        int month1 = sc.nextInt();
//        System.out.print("请输入日份：");
//        int day1 = sc.nextInt();
//        int year2 = 1990;
//        int month2 = 01;
//        int day2 = 01;

        Calendar instance = Calendar.getInstance();
        Calendar instance1 = Calendar.getInstance();
        Date date1 = new Date();
        instance.setTime(parse1);
        Date time = instance.getTime();
        long time1 = time.getTime();
        System.out.println(time1);


    }

}
