package com.atguigu.Student;

public class Student {
    private String name;
    private int age;
    private String home;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public Student( String name, int age, String home) {
        this.name = name;
        this.age = age;
        this.home = home;
    }

    @Override
    public String toString() {
        return name + "\t" + age + "\t" + home;
    }
}
