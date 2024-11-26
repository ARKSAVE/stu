package zuoye;

import java.util.Scanner;

public class tuzi_2 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = run(n);
        for (int i = 0 ;i < n;i++){
            System.out.println(a[i]);
        }
    }


    public static int[] run(int n) {
        int[] a = new int[100];
        a[0] = 0;
        a[1] = 1;

        for (int i = 2; i < n; i++) {
            a[i] = a[i - 1] + a[i - 2];
        }

        return a;
    }
}

