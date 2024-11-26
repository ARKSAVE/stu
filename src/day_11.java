public class day_11 {
    public static void main(String[] args) {
        System.out.printf("我的名字是：%s\n今年%d岁","145",18);
        a aa = new b();
int inta = 123;
        aa.run(inta);
        aa = new a(1,2,2,5);
        aa.run(inta);






    }
}

class a{

    private int a;

    public a(int... ab){
    for (int bc : ab){
        System.out.println(bc);
    }
    }
    public void run(int a){

        System.out.println(a+"========");
        System.out.println("run a ");
    }
}
class b extends a{
    public void run(int a){
        System.out.println(a);
        System.out.println("run b ");
    }
}