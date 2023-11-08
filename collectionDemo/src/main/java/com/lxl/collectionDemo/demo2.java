package com.lxl.collectionDemo;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.ArrayList;
import java.util.Collection;

public class demo2 {
    public static void main(String[] args) {
        Collection collection = new ArrayList();
        Student student =  new Student(100,"张三");
        Student student2 =  new Student(101,"李四");
        Student student3 =  new Student(102,"王五");

        collection.add(student);
        collection.add(student2);
        collection.add(student3);
        collection.add(student);

        System.out.println(collection.size());
        System.out.println(collection);





    }
}
