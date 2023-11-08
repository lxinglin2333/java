package com.lxl.collectionDemo;

import java.util.*;

/**
 * collection工具类的使用演示
 * */
public class demo3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);

        System.out.println(list);

        //排序
        Collections.sort(list);

        //二分查找
        Collections.binarySearch(list,20);

        //copy复制,注意两个集合大小必须一样（这垃圾方法会有人用？）
        List<Integer> listCopy = new ArrayList<>();
        for (int l = 0; l < list.size(); l++) {
            listCopy.add(0);
        }
        Collections.copy(listCopy,list);
        System.out.println(listCopy);

        //反转，原来是正序就变为倒序
        Collections.reverse(list);

        //shuffle,洗牌打乱
        Collections.shuffle(list);

        //集合转数组，数组长度小于集合会自动扩容
        Integer[] arr = list.toArray(new Integer[0]);

        //数组转集合,这样的集合不能删除或者增加数组
        String[] status = {"bad","good"};
        List<String> list1 =  Arrays.asList(status);

        //基本数据类型数组转集合会有问题，转成包装类操作





    }
}
