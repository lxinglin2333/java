package com.lxl.collectionDemo;

import java.util.TreeMap;

public class treeMapDemo {
    public static void main(String[] args) {
        TreeMap<Student1,String> treeMap = new TreeMap<>();
        Student1 s1 = new Student1("zhangsan",001);
        Student1 s2 = new Student1("lisi",002);
        Student1 s3 = new Student1("wangwu",003);
        Student1 s4 = new Student1("maliu",004);

        treeMap.put(s1,"sb");
        treeMap.put(s2,"sb");
        treeMap.put(s3,"sb");
        treeMap.put(s4,"sb");

        //遍历 1.keyset 2.entryset


    }
}
