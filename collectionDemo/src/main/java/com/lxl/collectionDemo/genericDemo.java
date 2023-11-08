package com.lxl.collectionDemo;

/**
 *
 */
public class genericDemo<T> {
    //不能新建对象，因为T类型不确定，不能保证有空参构造和构造方法能用
//    T f = new T();
    //作为变量
    T t;

    //作为方法参数
    public void show(T t) {
        System.out.println(t);

    }

    //作为方法返回值
    public T getT() {
        return t;
    }

}
