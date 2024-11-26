package zuoye;

import java.util.Scanner;

public class day_10 {
    public static void main(String[] args) {
        run();
    }
    public static void run() {
        float[] a = new float[100];
        a[0] = 1;
        a[1] = 2;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 2; i < n; i++) {
            a[i] = (a[i - 2] + a[i - 1])/2;
            System.out.println(a[i]);
        }
    }
}
