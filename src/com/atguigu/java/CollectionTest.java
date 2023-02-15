package com.atguigu.java;

import org.junit.Test;

import java.util.*;

public class CollectionTest {
    @Test
    public void Collectiontest1() {
        Collection coll1 = new ArrayList();
        coll1.add(123);
        coll1.add(456);
        coll1.add(new String("Hello"));
        coll1.add(new Person("Tom", 12));
        coll1.add(false);
        System.out.println(coll1.contains(123));
        System.out.println(coll1.contains(new String("Hello")));
        Person p = new Person("Tom", 12);
        coll1.add(p);
        System.out.println(coll1.contains(p));
        System.out.println(coll1.contains(new Person("Tom", 12)));
//        Collection coll2 = Arrays.asList(123,45676);
        Collection coll2 = Arrays.asList(123, 456);
        System.out.println(coll1.containsAll(coll2));
    }

    @Test
    public void Collectiontest2() {
        Collection coll1 = new ArrayList();
        coll1.add(123);
        coll1.add(456);
        coll1.add(new String("Hello"));
        coll1.add(new Person("Tom", 12));
        coll1.add(false);
//        System.out.println(coll1.remove(123));
        Collection coll2 = Arrays.asList(123, 456, 789);
//        coll1.removeAll(coll2);
        coll1.retainAll(coll2);
        System.out.println(coll1);
//        Collection coll3 = new ArrayList();
//        coll3.add(123);
//        coll3.add(456);
//        coll3.add(new String("Hello"));
//        coll3.add(new Person("Tom",12));
//        coll3.add(false);
//
//        System.out.println(coll1.equals(coll3));
    }

    @Test
    public void Collectiontest3() {
        Collection coll1 = new ArrayList();
        coll1.add(123);
        coll1.add(456);
        coll1.add(new String("Hello"));
        coll1.add(new Person("Tom", 12));
        coll1.add(false);
        System.out.println(coll1.hashCode());

        //集合 --> 数组
        Object[] objects = coll1.toArray();
        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i]);
        }
        //数组 --> 集合
        List<String> strings = Arrays.asList("AA", "NN", "CC");
        System.out.println(strings);

        List<Integer> integers = Arrays.asList(123, 456);
        System.out.println(integers);
    }

    @Test
    public void Collectiontest4() {
        Collection coll1 = new ArrayList();
        coll1.add(123);
        coll1.add(456);
        coll1.add(new String("Hello"));
        coll1.add(new Person("Tom", 12));
        coll1.add(false);

        Iterator iterator = coll1.iterator();

        //hasnext() 和 next();
        //next() --> 取元素
//        System.out.println("next() --> 取元素");
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
        System.out.println("推荐这么用 --> hasnext + next");
        while (iterator.hasNext()){
            System.out.println(iterator.next());

        }
    }
}
