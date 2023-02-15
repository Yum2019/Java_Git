package com.atguigu.java1;

import org.junit.Test;

import java.lang.annotation.Annotation;
import java.util.ArrayList;

public class MyAnnotationTest {
    @Test
    public void getAnnotation(){
        Class studentClass = student.class;
        Annotation[] annotation = studentClass.getAnnotations();
        for (int i = 0; i < annotation.length; i++) {
            System.out.println(annotation[i]);
        }
    }
}

class Generic<@MyAnnotation T>{

    public void show() throws @MyAnnotation RuntimeException{
        ArrayList<@MyAnnotation String> list = new ArrayList<>();
        int  num = (@MyAnnotation int) 1315L;
    }
}
@MyAnnotation(value = "hi")
@MyAnnotation(value = "hello")
class person{
    public void show() {
    }
}

class student extends person{
    public void show(){
        System.out.println("hello");
    }
}
