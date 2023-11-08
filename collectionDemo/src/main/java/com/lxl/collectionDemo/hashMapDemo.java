package com.lxl.collectionDemo;

import java.util.HashMap;

/**
 * 存储结构：链表（数组+链表+红黑树）
 * */
public class hashMapDemo {
    public static void main(String[] args) {
        HashMap<Student1,String> a = new HashMap();
        Student1 s1 = new Student1("zhangsan",1);
        Student1 s2 = new Student1("lisi",2);
        Student1 s3 = new Student1("wangwu",3);
        Student1 s4 = new Student1("maliu",4);
        Student1 s5 = new Student1("maliu",4);

        a.put(s1,"憨憨");
        a.put(s2,"老实人");
        a.put(s3,"老王");
        a.put(s4,"老六");
        a.put(s5,"牛头人");

        System.out.println(a);

        //删除
        a.remove(s1);

        //遍历
        for (Student1 key:a.keySet()) {
            System.out.println(key.toString()+","+a.get(key));
        }





    }
}
