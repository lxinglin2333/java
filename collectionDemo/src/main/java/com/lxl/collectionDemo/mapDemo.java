package com.lxl.collectionDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 存储结构：键值对
 * 特点：键不可重复、值可以重复 无序
 **/
public class mapDemo {

    public static void main(String[] args) {
        Map<String,String> map= new HashMap();
        map.put("a","100");
        map.put("b","200");
        map.put("c","300");
        map.put("d","400");

        System.out.println(map.toString());

        map.remove("a");

        //遍历
        //相当于把key存在set集合里面，通过遍历set集合得到key再获取value
        Set<String> keyset = map.keySet();
        for (String k:keyset) {
            System.out.println(k+","+map.get(k));
        }
        //entry相当于一个映射对象，存了k和v
        Set<Map.Entry<String,String>> entries= map.entrySet();
        for (Map.Entry<String,String> kv:map.entrySet()) {
            System.out.println(kv.getKey()+","+kv.getValue());

        }
        ;

    }
}
