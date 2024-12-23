package 作业;

import java.util.Arrays;
import java.util.Scanner;
/*



输入一个整数n。
判断n是否为正整数，如果不是，则提示用户重新输入。

3.计算n个序列偶数之和，并将结果存储在二维数组的第一行。示例 如果n是3，结果应该是 2t4+6的和。如果是n为4
2+4+6+8;
计算n个序列 的阶乘，并将结果存储在二维数组的第二行。n=5，结果1*2*3*4*5

对于每个偶数，判断其是否是4的倍数，如果是则将其乘以2后的结果存储在二维数组的第三行。
6：输出二维数组的所有元素，并计算数组中所有元素的总和。
判断数组中所有元素的总和是否为完全平方数，如果是，则输出“总和是完全平方数”;如果不是,则输出“总和不是完全平方数”


*/


public class int_caozuo {


    public static int[][] shu;


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {


            System.out.println("请输入一个正整数：");
            int n = sc.nextInt();
            chushihua(n);
            if (n > 0) {
                he(n);
                ch(n);
                is4(n);
                System.out.println("数组的总和为：" + end());
                end2(end());
            } else flag = false;

        }
    }


    public static void chushihua(int n) {
        //初始化偶数数组
        shu = new int[3][n];


    }


    static void he(int a) {
        int num = 0;
        for (int i = 0; i < a; i++) {
            num += (i + 1) * 2;
            shu[0][i] = num;
        }


        //输出n个偶数的和
    }

    static void ch(int a) {
        int num = 1;
        int b = 0;
        for (int i = 0; i < a; i++) {
            num = num * (i + 1);
            shu[1][i] = num;
        }

    }


    static void is4(int a) {
        for (int i = 1; i < shu.length - 1; i++) {
            for (int j = 0; j < shu[i - 1].length; j++) {
                if (shu[i][j] % 4 == 0) {
                    shu[2][j] = shu[i][j] * 2;
                }
            }
        }
    }


    static int end() {
        int num = 0;
        for (int i = 1; i < shu.length; i++) {
            for (int j = 0; j < shu[i - 1].length; j++) {
                num += shu[i][j];

            }
        }
        return num;

    }


    static void end2(int a) {
        if (Math.sqrt(a) - (int) Math.sqrt(a) == 0) {
            System.out.println("总和是完全平方数");
        } else {
            System.out.println("总和不是完全平方数");

        }
        System.out.println(Arrays.toString(shu[0]));
        System.out.println(Arrays.toString(shu[1]));
        System.out.println(Arrays.toString(shu[2]));
    }

}




