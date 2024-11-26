public class Main {
    public static void main(String[] args) {
        int a;
        int b;
        a = 100;
        b = 200;
        int c;
        c = a + b;
        int [] c_size = new int [3];
        c_size[0] = c;
        int y = 10;
        double y_float = 10.51;
        c_size[1] = (int)(y_float + y);
        System.out.println(c_size[1]+ "\n" + c_size[0]);




        double d = 10.65;
        double e = 16.25;
        double [] d_size = new double [4];
        d_size[3] = d * e;
        System.out.println(d_size[3]);

     }
}