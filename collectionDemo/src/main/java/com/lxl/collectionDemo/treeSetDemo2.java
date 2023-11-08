package com.lxl.collectionDemo;

import java.util.Comparator;
import java.util.TreeSet;

/**
 *定制排序
 *实现字符串按长度排序案例
 * Compaarator比较器 */

public class treeSetDemo2 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet(new Comparator<String>() {
            //比较器自定义比较规则
            /**
             * 作用1.自定义排重
             * 作用2.自定义排序*/
            @Override
            public int compare(String o1, String o2) {
                //按照第一个比较的属性进行升序排序
                int n1=o1.length()-o2.length();
                //再按照第二个比较的属性进行升序排序
                int n2=o1.compareTo(o2);
                //如果n1等于0，即o1o2长度一样，返回n2
                //如果n1不等于0,返回n1
                //返回值是0认为是重复元素，集合不添加
                return n1==0?n2:n1;
            }
        });

        treeSet.add("abc");
        treeSet.add("f");
        treeSet.add("c");
        treeSet.add("e");
        treeSet.add("e");
        treeSet.add("ee");

        System.out.println(treeSet.toString());

    }
}
