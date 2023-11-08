package com.lxl.collectionDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class listDemo {
    public static void main(String[] args) {
        List list =  new ArrayList();
        list.add("banana");
        list.add("milk");
        list.add(0,"candy");
        System.out.println(list.toString());

        //可以根据脚标或者内容移除
//        list.remove(0);
//        list.remove("banana");


        //遍历1.普通for 2.增强for 3.迭代器 4.列表迭代器
        for(int i=0;i<list.size();i++){
            System.out.println(list.toString());
        }

        for (Object o : list) {
            System.out.println(o);
        }

        Iterator it = list.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
        //正序遍历
        ListIterator ls_it = list.listIterator();
        while (ls_it.hasNext()){
            System.out.println(ls_it.nextIndex()+":"+ls_it.next());
        }
        //倒序遍历
        while(ls_it.hasPrevious()){
            System.out.println(ls_it.previousIndex()+":"+ls_it.previous());
        }

        //判断
        System.out.println(list.contains("banana"));
        System.out.println(list.isEmpty());

        //获取位置
        System.out.println(list.indexOf("banana"));


    }
}
