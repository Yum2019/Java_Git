package com.atguigu.java;

/**
    5.0之后的写法。
    省却许final、static，实例等步骤，省去了get方法。


    2、枚举类还可以实现接口
 */
public class EnumTest1 {
    public static void main(String[] args) {
        Season1 spring = Season1.SPRING;
        System.out.println(spring);
        System.out.println("*******");
        //values 返回当前有多少个枚举类
        Season1[] values = Season1.values();
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
            values[i].show();
        }
        System.out.println("*******");
        //valueOf 返回搜索的关键字（obj），返回该关键字的状态。
        Season1 winter = Season1.valueOf("WINTER");
        System.out.println(winter);
        //如果没有该关键字会返回报错信息。
//        Season1 winter1 = Season1.valueOf("winter");
//        System.out.println(winter1);



    }
}

interface Song{
    void show();
}

enum Season1 implements Song{
    //1.把需要枚举的先列出来 --> 用”,“隔开用”;“结尾
    SPRING("春天","春暖花开"){
        @Override
        public void show() {
            System.out.println("春天在哪里？");
        }
    },
    SUMMER("夏天","夏日炎炎"){
        @Override
        public void show() {
            System.out.println("宁夏");
        }
    },
    AUTUMN("秋天","秋风飒飒"){
        @Override
        public void show() {
            System.out.println("秋天在哪里？");
        }
    },
    WINTER("冬天","冰天雪地"){
        @Override
        public void show() {
            System.out.println("第一场雪");
        }
    };


    //2.定义私有化的属性。
    private final String Season1Name;
    private final String season1Desc;

    //3.私有化的构造器，并且传入枚举所需的形参
    private Season1(String Season1Name,String season1Desc){
        this.season1Desc = season1Desc;this.Season1Name = Season1Name;
    }

    //4.如果需要拿到属性那么就要重写tostring方法
    @Override
    public String toString() {
        return "Season1{" +
                "Season1Name='" + Season1Name + '\'' +
                ", season1Desc='" + season1Desc + '\'' +
                '}';
    }
}
