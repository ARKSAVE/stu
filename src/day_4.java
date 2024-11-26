import java.util.Scanner;

public class day_4 {
    public static void main(String[] args) {
        int[][] two = new int[3][5];
        for (int i = 0; i < two.length; i++) {
            for (int j = 0; j < two[i].length; j++) {
                two[i][j] = i + j;
                //写入行与列之和
                System.out.print(two[i][j]);
            }
            System.out.println();
        }


        Scanner sc = new Scanner(System.in);
        System.out.println("输入：");
        int s = sc.nextInt();
        //仅允许输入int
        System.out.println(s);

        switch (s) {
            case 1:
                System.out.println("好好学习");
                break;
            case 2:
                System.out.println("天天向上");
                break;
            case 3:
                System.out.println("11111111");
                break;

        }
    }
}
