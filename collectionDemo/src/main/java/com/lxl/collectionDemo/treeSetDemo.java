package com.lxl.collectionDemo;

import java.util.TreeSet;

/**存储结构：红黑树
 * 元素即引用对象必须实现Comparable接口，comparreTo（）方法返回值是0，认为是重复元素
 * 自然排序
 * */
public class treeSetDemo {
    public static void main(String[] args) {
        TreeSet<people> treeSet = new TreeSet<>();


        people p = new people(1,"a",1.23);
        people p1 = new people(2,"b",1.24);
        people p2 = new people(3,"c",1.25);
        people p3 = new people(4,"d",1.26);

        treeSet.add(p);
        treeSet.add(p1);
        treeSet.add(p2);
        treeSet.add(p3);
        treeSet.add(new people(4,"d",1.26));

        System.out.println(treeSet);

        //删除

        //遍历 1.增强for 2.迭代器

    }
}
