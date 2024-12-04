package 练习.接口.动物叫;

 public interface jk {
    void jiao();
}

class gou implements jk {
    public void jiao(){
        System.out.println("狗叫");
    }

}

class mao implements jk {
    @Override
    public void jiao() {
        System.out.println("猫叫");
    }

}

class niu implements jk {
    @Override
    public void jiao() {
        System.out.println("牛叫");
    }
}



