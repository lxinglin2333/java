package com.lxl.collectionDemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * hashset
 * 特点：无序 无下标 不能重复*/
public class setDemo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("zhangsan");
        set.add("lisi");
        set.add("wangwu");
        set.add("maliu");
        System.out.println(set);

        //遍历1.增强for 2.迭代器
        for (String s:set) {
            System.out.println(s);
        }

        Iterator<String> it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
