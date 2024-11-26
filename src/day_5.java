public class day_5 {
    public static void main(String[] args) {
        int[] age = {13, 15, 16, 18, 53};
        String[] name = {"小明", "小王", "小宋", "小龙", "老王"};
        for (int num = 0; num < 5; num++) {
            my.ddd(name[num],age[num]);


        }

    }

}


class my{
     static void ddd(String name,int age) {
        int aba = 1233;
        System.out.printf("我的名字是：%s   我的年龄是：%d\n",name,age);
        bbb(name,age);
    }

   static void bbb(String name,int age) {
        System.out.printf("My name is : %s\n",name);
    }
}
