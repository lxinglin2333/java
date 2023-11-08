package com.lxl.collectionDemo;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * 存储结构：双向链表
 * 查询快 删除增加慢*/
public class linkedListDemo {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList<>();
        Student s1 = new Student(12,"zhangsan");
        Student s2 = new Student(13,"lisi");
        Student s3 = new Student(14,"wangwu");
        Student s4 = new Student(15,"maliu");
        Student s5 = new Student(16,"zhaoqi");

        linkedList.add(s1);
        linkedList.add(s2);
        linkedList.add(s3);
        linkedList.add(s4);

        System.out.println(linkedList);

        System.out.println("--delete--");

        //删除
//        linkedList.remove(new Student(12,"zhangsan"));
//        System.out.println(linkedList);
//        linkedList.clear();

        //遍历
        System.out.println("--for--");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }

        System.out.println("--增强for--");
        for (Object o: linkedList) {
            Student s = (Student)o;
            System.out.println(s);
        }

        System.out.println("--Iterator--");
        Iterator iterator = linkedList.iterator();
        while(iterator.hasNext()){
            Student s = (Student)iterator.next();
            System.out.println(s);
        }






    }



}
