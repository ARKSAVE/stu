package arrpx;

import com.sun.security.jgss.GSSUtil;

public class binggui {
    public static void main(String[] arg) {
        int[] arr = new int[]{5, 3, 8, 4, 2, 1, 9};
        a(arr);
    }

    static void a(int[] arr) {
        int[] ob = b(arr, 0, arr.length - 1);
    }

    static int[] b(int[] arr, int low, int high) {
        if (high-low <= 2) {
            return arr;
        }
        int mid = high / 2;

        int[] l=b(arr, low, mid);
   int[] r= b(arr, mid + 1, high);


        return arr;
    }


    static void c(int[] arr, int low, int mid, int hign) {


    }
}
