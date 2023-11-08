package com.lxl.collectionDemo;

public interface genericInterface<T> {

    String name = "zhansan";

    //在接口中作为方法
    T server(T t);

}
