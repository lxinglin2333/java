package com.lxl.collectionDemo;

import java.util.Enumeration;
import java.util.Vector;

/**
 * 存储结构：数组*/

public class vectorDemo {
    public static void main(String[] args) {
        Vector vector = new Vector();
        vector.add("001");
        vector.add("002");
        vector.add("003");

        //删除1.根据下标删除 2.根据内容删除 3.清除集合内数据
        vector.remove(0);
        vector.remove("002");
        vector.clear();

        //枚举器
        Enumeration en = vector.elements();
        while(en.hasMoreElements()){
            String o = (String) en.nextElement();
            System.out.println(o);
        }
    }
}
