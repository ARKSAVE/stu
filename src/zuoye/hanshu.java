package zuoye;

public class hanshu {
    public static void main(String[] args) {
        //程序主入口
        int a = 10;
        int b = 20;
        //赋值变量
        int cfa = cf(a,b);
        //调用函数
        int jiafa = jf(a,b);

        int jf = jfa(a,b);
        System.out.print("乘法结果为：" + cfa);
        System.out.println();
        System.out.print("加法结果为：" + jiafa);
        System.out.println();
        System.out.print("减法结果为：" + jf);
        //打印结果
    }




    static int cf(int a, int b) {
        //cf函数
        int d = a * b;
        //乘法运算
        return d;
        //输出变量d
    }

    static int jf(int a, int b) {
        int d = a + b;
        return d;
        //同上，加法
    }


    static int jfa(int a, int b) {
        int d = a - b;
        return d;
    }
}
