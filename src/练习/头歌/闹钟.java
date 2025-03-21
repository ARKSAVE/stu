package 练习.头歌;

import java.util.Scanner;

public class 闹钟 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        boolean flag = true;
        while (flag) {
            int x = sc.nextInt();
            int q = sc.nextInt();
            for (int i = 0; i < q; i++) {
                System.out.println("""
                        研究方式
                        1.假设正常时间走了 t 分钟，计算闹钟走的时间；
                           2.假设闹钟走了 t 分钟，计算正常时间走的时间；
                           3.当闹钟与当前正确时间相同时，此时记为第 0 次，计算第 k 次闹钟显示的时间与正确时间相同需要的时间
                        """);
                int qx = sc.nextInt();
                switch (qx) {
                    case 1:
                        fn1(x);
                        break;
                    case 2:
                        fn2(x);
                        break;
                    case 3:
                        fn3(x);
                        break;
                }
            }
        }
    }

    private static void fn3(int x) {
    }

    private static void fn2(int x) {
        int t = sc.nextInt();
        //正常时间=60
        System.out.printf("%.3f",(float)(t));
    }

    public static void fn1(int x) {
        int t = sc.nextInt();
    System.out.printf("%.2f",(float)t*(60-x));

        }
}

