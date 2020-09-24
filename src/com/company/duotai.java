package com.company;
/*
*       多态的成员特点
*           成员变量：编译时看的是左边，运行看左边
*           成员方法：编译看的是左边，运行看右边
*           静态方法 编译 看的是左边，运行时也是左边
* */
public class duotai {
    public static void main(String[] args) {
        dad d=new kid();
        d.eat();
    }
}
class dad{
    int num;
    public  void eat(){
        System.out.println("dad");
    }
}
class  kid extends  dad{
    int num=10;
    public  void eat(){
        System.out.println("kid");
    }
    public  void fun(){
        System.out.println("我是静态");
    }
}
