package com.lxl.collectionDemo;

/**
 * 泛型类的使用*/

public class genericTest {
    public static void main(String[] args) {
        //泛型类型只能是引用类型
        genericDemo<String> genericD=new genericDemo<String>();
        genericD.t="hello";
        genericD.show("123");
        String string = genericD.getT();


        genericDemo<Integer> genericD2 = new genericDemo<Integer>();

        //泛型接口
        genericInterfaceImp imp = new genericInterfaceImp();
        imp.server("192.168.104.56");

        genericInterfaceImp2<Integer> imp2 = new genericInterfaceImp2<>();
        imp2.server(100);

        //泛型方法,参数类型因为是泛型还不确定，根据传进去的参数决定
        genericMethod genericM = new genericMethod();
        genericM.show("001");

    }




}
