package zuoye;


import java.util.Random;

public class day_8 {

    public static void main(String[] args) {
        Random rand = new Random();
        int flag = 0;
        String arr = "";
        while (flag < 100) {
            int i = rand.nextInt(1000);
            if (!arr.contains(i + "")) {
                arr = arr + i + ",";
                flag++;
                System.out.println(arr);
            }
        }
        if (!arr.isEmpty()) {
            arr = arr.substring(0, arr.length() - 1);
        }

        System.out.println(arr);
        String[] arrs = arr.split(",");
        int[] b = new int[arrs.length];
        for (int i = 0; i < arrs.length; i++) {
            b[i] = Integer.parseInt(arrs[i]);
        }
        paixv(b);
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }


    }

    static void paixv(int[] b) {
       int[] d = c(b,0,b.length-1);
        for (int i=0;i<b.length;i++) {
            System.out.println(d[i]);
        }
    }

    static int[] c(int[] b,int low,int hign) {
        if (low<hign) {
            int jz = e(b,low,hign);
            c(b,low,jz-1);
            c(b,jz+1,hign);
        }
        return b;
    }


    static int e(int[] b,int low,int hign) {
        int i = low;
        int cun = b[low];
        while (i!=hign) {

            while (b[i]<cun) {
                i++;
            }
            while (b[hign]>cun) {
                hign--;
            }
            int temp = b[i];
            b[i] = b[hign];
            b[hign] = temp;
        }
        return i;
    }
}




