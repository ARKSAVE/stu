package 练习.接口.图形计算;

import java.util.Scanner;

public class 实现 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("请输入功能序号：");
            System.out.println("""
                1 .圆
                2 .矩形
                3 .三角形
                
                """);
            int in = sc.nextInt();
if (in == 1) {
    System.out.println("请输入圆半径：");
    float r = sc.nextFloat();
    yuan yuan = new yuan(r);
    yuan.s();
    yuan.v();
}else if (in == 2) {
    System.out.println("请输入长与宽：");
    float h = sc.nextFloat();
    float w = sc.nextFloat();
    ju ju = new ju(h,w);
  ju.s();
  ju.v();
}else if (in == 3) {
    flag = false;
}

        }

    }
}
