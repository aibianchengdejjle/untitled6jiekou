package com.company;

public class interfacetest {
    public static void main(String[] args) {
        baskerball bk=new baskerball();
        bk.name="jjl";
        System.out.println(bk.name);
        bk.speak();
        bk.study();
        bk.eat();
        bk.sleep();
        pingpongcoach p=new pingpongcoach();
        p.teach();

    }
}
class  person{
    String name; //姓名
    int age; //年龄
    String gender; //性别
    public  person(){

    }
    public  person( String name,int age,String gender)
    {
        this.name=name;
        this.age=age;
        this.gender=gender;
    }
    public  void eat(){
        System.out.println("吃饭");
    }
    public  void sleep(){
        System.out.println("睡觉");
    }
}
//运动员
abstract  class   player extends person{
    public  abstract  void study();
}
//教练
abstract  class  coach extends  person{
    public  abstract  void teach();
}
class  baskerball extends  player implements english{
    @Override
    public void study() {
        System.out.println("扣篮");
    }

    @Override
    public void speak() {
        System.out.println("篮球运动员说英语");
    }
}
class pingpong extends player{

    @Override
    public void study() {
        System.out.println("打乒乓球");
    }
}
class baskercoach extends  coach implements english{

    @Override
    public void teach() {
        System.out.println("教扣篮");
    }

    @Override
    public void speak() {
        System.out.println("说英语篮球教练");
    }
}
class pingpongcoach extends  coach{

    @Override
    public void teach() {
        System.out.println("教打乒乓球");
    }
}
interface  english{
    public  abstract  void speak();
}
