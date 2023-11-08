package com.lxl.collectionDemo;

/**
 * 实现类中确定数据类型genericInterface<String>，对比genericInterfaceImp2
 * */

public class genericInterfaceImp implements genericInterface<String>{

    @Override
    public String server(String s) {
//        System.out.println(s);
        return s;
    }
}
