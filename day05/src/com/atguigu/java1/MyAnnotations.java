package com.atguigu.java1;

import java.lang.annotation.*;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.ElementType.LOCAL_VARIABLE;

@Inherited  //可以被子类继承。
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Target({TYPE,FIELD,METHOD,PARAMETER,CONSTRUCTOR,LOCAL_VARIABLE})
public @interface MyAnnotations {
    MyAnnotation[] value();
}
