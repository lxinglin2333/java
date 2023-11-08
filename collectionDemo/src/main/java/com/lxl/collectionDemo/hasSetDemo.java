package com.lxl.collectionDemo;

import java.util.HashSet;
import java.util.Iterator;

/**
 * 存储结构：哈希表（数组+链表+红黑树（jdk1.8之后））*/

public class hasSetDemo {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("a");
        hashSet.add("b");
        hashSet.add("c");
        //添加重复数据不会报错，但实际还是存储只一个数据
        hashSet.add("a");

        //删除
        hashSet.remove("a");

        //遍历

        for (String s:hashSet) {
            System.out.println(s);
        }

        Iterator<String> iterator = hashSet.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
