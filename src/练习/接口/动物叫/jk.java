package 练习.接口.动物叫;

 public interface jk {
     String name = "动物：";
    void jiao();

}
 interface eat{
     void eat();
}

class gou implements jk ,eat{
    public void jiao(){
        System.out.println(name+"狗叫");
    }

    @Override
    public void eat() {

    }
}

class mao implements jk {
    @Override
    public void jiao() {
        System.out.println(name+"猫叫");
    }

}

class niu implements jk {
    @Override
    public void jiao() {
        System.out.println("牛叫");
    }
}



