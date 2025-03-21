package 作业.r20250314;
//继承和方法重写
public class jc{
    public static void main(String[] args) {
        Circle c = new Circle();
        c.draw();
        Square s = new Square();
        s.draw();
        Manager m = new Manager("孙莫",2000,"混子部");
        m.shouInfo();
        System.out.println("----------------------");
        Laptop l = new Laptop();
        l.turnOn();
        l.chargeBattery();
    }
}
class Shape{
    void draw(){
        System.out.println("画一个图形");
    }
}

class Circle extends Shape{
    void draw(){
        System.out.println("画一个圆形");
    }
}

class Square extends Shape{
    void draw(){
        System.out.println("画一个正方形");
    }
}



//继承和属性访问
class Employee{
    public String name;
    private int salary;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}

class Manager extends Employee{
    String department;
    Manager(String name, int salary, String department) {
        this.name = name;
        setSalary(salary);
        this.department = department;
    }
    void shouInfo(){
        System.out.println(name+"   "+getSalary()+"   "+department);
    }
}



class Device{
    void turnOn(){
        System.out.println("设备已打开");
    }
}

class Computer extends Employee{
    void turnOn(){
        System.out.println("电脑已启动");
    }
}

class Laptop extends Employee{
    void turnOn(){
        System.out.println("笔记本已启动");
    }
    void chargeBattery(){
        System.out.println("正在充电");
    }
}