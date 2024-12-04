public class day_11 {
    public static void main(String[] args) {
        System.out.printf("我的名字是：%s\n今年%d岁\n","145",18);

int inta = 123;
int aab = 1235;
//        a aa = new b(aab);
//        aa.run(inta);
//        aa = new a(aab);
//        aa.runn();
//        aa.in();
//        b bb = new b(aab);
//        bb.run(inta);
a aa = new b(inta);
    }
}

class a{
    public int aab;
    public a(int aab) {
        this.aab = aab;
        System.out.println(aab);
    }
    public void in(){
        System.out.println("in    "+aab);

}
    public void run(int a){

        System.out.println(a+"========");
        System.out.println("run a ");
    }
    public void runn(){
    System.out.println(aab);
    }
}
class b extends a{

    public b(int aab) {
        super(aab);
    }
    {
        aab+=20;
    }

    public void run(int a){
        System.out.println(a);
        System.out.println("run b ");
    }
}