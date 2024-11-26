package zuoye;

public class tuzi {
    static int tuzi = 1;
    static int yue = 10;
    static int xin1 = 0;
    static int xin2 = 0;
    static int xin3 = 0;
    static int shu = 1;
    static int zong = 0;

    public static void main(String[] args) {
        for (int i = 0; i < yue; i++) {
            suan(i);

        }
    }


    static void suan(int i) {
        int s1 = xin1;
        int s2 = xin2;
        int s3 = xin3;
int su = shu;
        if (i % 3 == 0) {
            shu = shu + xin3;
            xin3 = xin2;
            xin2 = xin1;
            xin1 = shu;
        } else if (i % 3 != 0) {
            xin3 = xin2;
            xin2 = xin1;
            xin1 = shu;
        }


        tuzi = xin1 + xin2 + xin3;
        System.out.println(tuzi);
    }





}
