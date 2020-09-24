package com.company;
/*
*       抽象类是两个类之间有共性但不是完全相同的所以用抽象类
*       多态，只需要转递参数的不同状态就可以实现不同的功能
* */
public class shouij {
    public static void main(String[] args) {
        mifact mi=new mifact();
        mi.creat(new mi());
        mi.creat(new redmi());
    }
}
/*
*       接口是用来规范传入参数的类型的    接口是用来实现多态的
*
* */
interface  phone{
  public  void call();
}
class mifact {
    public  void creat(phone c) {
        c.call();
    }
}
class  mi implements phone{
    public  void call(){
        System.out.println("xiaomi");
    }
}
class redmi implements phone{
    public  void call(){
        System.out.println("redmi");
    }

}

