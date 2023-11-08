package com.lxl.collectionDemo;

import java.util.HashSet;

/**
 *存储过程
 * （1）根据hascode计算保存的位置，如果位置为空，直接保存，不然继续第二步
 * （2）再执行equals方法，如果返回ture则认为是重复，否则形成链表
 * （3）*/
public class hasSetDemo2 {
    public static void main(String[] args) {
        HashSet<people> hashSet = new HashSet<>();
        people p = new people(1,"a",1.23);
        people p1 = new people(2,"b",1.24);
        people p2 = new people(3,"c",1.25);
        people p3 = new people(4,"d",1.26);

        hashSet.add(p);
        hashSet.add(p1);
        hashSet.add(p2);
        hashSet.add(p3);
        //引用地址不一样，还是能添加进去
        hashSet.add(new people(4,"d",1.26));

        //重写完hascode与equlse方法后，不能继续添加
        hashSet.add(new people(4,"d",1.26));

        System.out.println(hashSet);

        //遍历 1.增强for 2.迭代器

    }
}
