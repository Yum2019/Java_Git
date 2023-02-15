package com.atguigu.java;

public class Goods implements Comparable{
    private String name;
    private int privace;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrivace() {
        return privace;
    }

    public void setPrivace(int privace) {
        this.privace = privace;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "name='" + name + '\'' +
                ", privace=" + privace +
                '}';
    }

    public Goods(String name, int privace) {
        this.name = name;
        this.privace = privace;
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Goods) {
            Goods goods = (Goods) o;
            if (this.privace > goods.privace) {
                return 1;
            } else if (this.privace < goods.privace) {
                return -1;
            } else {
                return this.name.compareTo(goods.name);
            }
        }
        throw new RuntimeException("传入的数据类型不一致！");
    }
}
