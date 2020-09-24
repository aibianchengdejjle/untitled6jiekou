package com.company;

import java.util.Scanner;

public class mytest {
    public static void main(String[] args) {
        bk b=new bk();
        b.eat();
        b.learn();
        bkcoach bk1=new bkcoach();
        bk1.teach();
        Scanner sc=new Scanner(System.in);
        bk1.name=sc.next();
        bk1.age=sc.next();
        System.out.println(bk1.age+"----"+bk1.name);
    }
}
class  Person{
    String name;
    String age;
    public  void eat(){
        System.out.println("吃饭");
    }
    public  void sleep(){
        System.out.println("睡觉");
    }
}
abstract  class  Coach extends  Person{
    abstract  void teach();

}
abstract  class  Player extends  Person{
    abstract  void play();
}
class bkcoach extends  Coach implements  English{

    @Override
    void teach() {
        System.out.println("教打篮球");
    }

    @Override
    public void learn() {
        System.out.println("篮球教练说英语");
    }
}
class  ppcoach extends  Coach{

    @Override
    void teach() {
        System.out.println("教打pingpong球");
    }
}
class bk extends  Player implements English{

    @Override
    void play() {
        System.out.println("打篮球");
    }

    @Override
    public void learn() {
        System.out.println("篮球运动员说英语");
    }
}
class  pp extends  Player {

    @Override
    void play() {
        System.out.println("打pingpong求");
    }


}
interface  English{
    abstract  void  learn();
}
