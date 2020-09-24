package com.company;
/*
      interface 接口
*     接口成员的特点
*     只有抽象方法
*     只有常量不能定义变量
*     默认且只能用public|| abstract来进行修饰
*   类与接口是实现关系（implements）
*     注意：
*          接口不能创建对象即接口不能实例化
*      一个类实现一个接口必须实现他所有的方法
* */
public class Main {

    public static void main(String[] args) {
	   cat c=new cat();
        System.out.println(c.name.length());
        c.sleep();

    }
}
interface  animal{
    public static  final String name="5678";
}
interface  c extends  animal{
    abstract   void sleep();      //只有抽象方法
}
          //实现
class cat implements c {
              @Override
              public void sleep() {
                  System.out.println(name + "jjl");
              }
          }
abstract  class  dog{
    abstract void eat();
}