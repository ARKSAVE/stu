package zuoye;

import java.util.Scanner;

public class dazhe {

    public static void main(String[] args) {
        System.out.println("""
                请输入功能编号：
                ——————————————————————
                ———1：打折计算器—————————
                ———2：省钱计算器————————
                ——————————————————————
                """);
        Scanner sc = new Scanner(System.in);
        int im = sc.nextInt();
        switch (im) {
            case 1:
                System.out.println("开始运行,输入0退出");
                float shoujia = x(im);
                System.out.printf("打折后的售价为：%.2f", shoujia);
                break;
            case 2:
                System.out.printf("打折后省钱：%.2f", x(im));
                break;
        }
    }


    public static float x(int im) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入价格：");
            float jg = sc.nextFloat();
            if (jg < 0) {
                System.out.println("价格输入错误");
            } else if (jg == 0) {
                System.out.println("正在退出·");
                break;
            } else {
                System.out.println("请输入折扣");
                float zk = sc.nextFloat();
                float shoujia = su(jg, zk);
                if (im == 2) {
                    return jg - shoujia;
                } else if (im == 1) {
                    return shoujia;
                }
            }
        }
        return 0;
    }


    public static float su(float jg, float zk) {
        System.out.printf("折扣为：%.2f\n", zk * 0.01f);
        return jg * (zk * 0.01f);
    }
}

