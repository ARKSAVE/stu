public class if_xue {
    public static void main(String[] args) {
        int a = 7;
        int b = 3;
        int mon = 1;
        if (a > 8 && b > 6) {
            System.out.println("满足1");
        } else if (mon > 5) {
            System.out.println("满足2");

        }else if (b >= 4) {
            System.out.println("满足3");

        }else if (a == 7 && b == 3 && mon == 1) {
            System.out.println("完美");
        }
    }
}
