package com.atguigu.java;

public class encapsulation {
    private String name;
    private int  gender;
    private int age;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getGender() {
        return gender == 0 ? "man" : "woman";
    }

    public void setGender(int  gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void work(){
        if(age <= 18 && age <= 50){
            System.out.println(name + "is woking very hard!");
        }else{
            System.out.println(name + "Can't work any more");
        }
    }

    public static void main(String[] args) {
        encapsulation e1 = new encapsulation();
        e1.setName("张三");
        e1.setGender(0);
        e1.setAge(22);
        e1.work();
    }
}
