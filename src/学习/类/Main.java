package 学习.类;
public class Main{
    public static void main(String[] agrs){
        Person p = new Person();
        p.getName();
        p.getAge();
        p.getHeight();
        System.out.println("一年后……");
        p.age +=1;
        p.getAge();
        person1 p1 = new person1();
        p1.setName("甘雨");
        p1.getName();
    }
}

class Person{

    Person(){
        System.out.println("构造函数");
    }
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }
    String name = "王小美";
    int age = 500;

    public int height = 168;

    public void getName(){
        System.out.println("名字："+name);
    }
    public void getAge(){
        System.out.println("年龄："+age);
    }
    public void getHeight(){
        System.out.println("身高（cm）："+height);
    }

}

class person1 extends Person{
    @Override
    public void setName(String name) {
        super.setName(name);
    }
}
