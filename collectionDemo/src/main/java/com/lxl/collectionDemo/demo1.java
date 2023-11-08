package com.lxl.collectionDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class demo1 {
    public static void main(String[] args) {
        Collection collection = new ArrayList();
        collection.add("香蕉");
        collection.add("牛奶");
        collection.add("面包");
        System.out.println(collection.size());
        System.out.println(collection);
        //collection.remove("面包");
        System.out.println(collection);
        //增强for遍历
        for (Object object: collection) {
            System.out.println(collection);
        }
        //迭代器遍历
        Iterator it = collection.iterator();
        while (it.hasNext()){
            //将引用类型强转为string类型
            String s = (String) it.next();
            System.out.println(s);
            //迭代器中不允许使用collection自带的删除
            //使用迭代器中的方法删除数据
            it.remove();
        }



    }
}
