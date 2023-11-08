package com.lxl.collectionDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/***
 * 存储结构：数组
 * 特点：查找遍历速度快，增删慢
 */

public class arrayListDemo {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList<>();
        Student student = new Student(100,"001");
        Student student2 = new Student(101,"002");
        Student student3 = new Student(102,"003");
        Student student4 = new Student(103,"004");
        people people1 = new people(1,"zhangsan",1.34);


        //
        arrayList.add(student);
        arrayList.add(student2);
        arrayList.add(student3);
        arrayList.add(student4);

        //在泛型集合中不允许添加不同类型的数据进入同一个集合
        arrayList.add(people1);

        //Iterator
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()){
            Object s = iterator.next();
            System.out.println(s.toString());
        }
        //listIterator
        ListIterator ls = arrayList.listIterator();
        while(ls.hasNext()){
            Object s = ls.next();
            System.out.println(s.toString());
        }

    }



}
