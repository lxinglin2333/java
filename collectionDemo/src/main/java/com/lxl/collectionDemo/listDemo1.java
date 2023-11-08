package com.lxl.collectionDemo;

import java.util.ArrayList;
import java.util.List;

public class listDemo1 {
    public static void main(String[] args) {
        List list = new ArrayList();
        //给集合添加基本类型时，集合内部会对基本类型进行一个封装
        //存储的不再是基本类型
        list.add(20);
        list.add(21);
        list.add(22);
        list.add(23);
        list.add(24);
        System.out.println(list.size());
        System.out.println(list.toString());

        //默认脚标删除，如果冲突，需要强转
//        list.remove((Object) 20);

        //含头不含尾，获取脚标是1和2的数据
        System.out.println(list.subList(1,3));


    }
}
