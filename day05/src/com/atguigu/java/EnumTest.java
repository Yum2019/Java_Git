package com.atguigu.java;

/**
 一、枚举类的使用
 1.枚举类的理解：类的对象只有有限个，确定的。我们称此类为枚举类。*
 2.当需要定义一组常量时，强烈建议使用枚举类。*
 3.如果枚举类中只有一个对象，则可以作为单例模式的实现方式。*
 二、如何定义枚举类
 方式一：jdk5.0之前，子定义枚举类
 方式二：jdk5.0，可以使用enum关键子定义枚举类
 */
public class EnumTest {
    public static void main(String[] args) {
        Season spring = Season.spring;
        System.out.println(spring.toString());
    }
}

class Season{
    private final String seasonName;
    private final String seasonDesc;

    private Season(String seasonName,String seasonDesc){
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    public static final Season spring = new Season("春天","春暖花开");
    public static final Season summer = new Season("夏天","夏日炎炎");
    public static final Season autumn = new Season("秋天","秋风飒飒");
    public static final Season winter = new Season("冬天","冰天雪地");

    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }
}

