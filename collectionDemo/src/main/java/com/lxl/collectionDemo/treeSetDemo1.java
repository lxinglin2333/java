package com.lxl.collectionDemo;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * 扩展知识
 * 通过Comparetor实现比较（比较器）
 * 不再需要元素实现Compareble接口*/

public class treeSetDemo1 {
    public static void main(String[] args) {
        //创建集合的时候就指定比较规则
        TreeSet<people> treeSet = new TreeSet<>(new Comparator<people>(){
            @Override
            public int compare(people o1, people o2) {
                int n1=o1.getName().compareTo(o2.getName());
                int n2=o1.getAge()-o2.getAge();
                double n3=o1.getHigh()-o2.getHigh();
                return n1==0?n2:n1;
            }
        });

        people p = new people(1,"a",1.23);
        people p1 = new people(2,"b",1.24);
        people p2 = new people(3,"c",1.25);
        people p3 = new people(4,"d",1.26);

        treeSet.add(p);
        treeSet.add(p1);
        treeSet.add(p2);
        treeSet.add(p3);
    }
}
