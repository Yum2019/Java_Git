package com.atguigu.java1;

import java.lang.annotation.*;

import static java.lang.annotation.ElementType.*;
@Inherited  //可以被子类继承。
@Repeatable(MyAnnotations.class)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Target({TYPE,FIELD,METHOD,PARAMETER,CONSTRUCTOR,LOCAL_VARIABLE,TYPE_PARAMETER,TYPE_USE})
        //类型，字段，方法，参数，构造器，局部变量
public @interface MyAnnotation {
    String value() default "hello";
}
