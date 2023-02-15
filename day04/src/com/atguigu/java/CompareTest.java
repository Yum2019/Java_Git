package com.atguigu.java;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

/**
    一、说明：Java中的对象，对对象比较大小，进行排序
        如何实现？ 实现两个接口中的任意一个：Comparable 活 Comparator
 */
public class CompareTest {
    @Test
    public void test1(){
        Goods []goods = new Goods[5];
        goods[0] = new Goods("小米",999);
        goods[1] = new Goods("红米",1399);
        goods[2] = new Goods("苹果",9000);
        goods[3] = new Goods("华为",3999);
        goods[4] = new Goods("荣耀",999);

        Arrays.sort(goods);
        System.out.println(Arrays.toString(goods));
    }


    /**
        按照名称从小到大，按照价格从大到小的排序方法
     */
    @Test
    public void test2(){
        Goods []goods = new Goods[6];
        goods[0] = new Goods("小米",999);
        goods[1] = new Goods("红米",1399);
        goods[2] = new Goods("苹果",9000);
        goods[3] = new Goods("华为",3999);
        goods[4] = new Goods("荣耀",999);
        goods[5] = new Goods("小米",2999);

        Arrays.sort(goods,new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Goods && o2 instanceof Goods){
                    Goods g1 = (Goods) o1;
                    Goods g2 = (Goods) o2;
                    if (g1.getName().equals(g2.getName())){
                        return -Double.compare(g1.getPrivace(),g2.getPrivace());
                }else {
                    return g1.getName().compareTo(g2.getName());
                    }
                }
                 throw new RuntimeException("传入的数据类型不一致！");
            }
        });
        System.out.println(Arrays.toString(goods));
    }
}
