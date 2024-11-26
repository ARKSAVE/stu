package zuoye;
import java.lang.Math.*;
import java.util.Scanner;

public class yuan {

    public static void main(String[] args) {
        cd();

    }




  public  static void cd(){
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("--------------------");
            System.out.println("--1:检测点是否在半径内--");
            System.out.println("--------------------");
            System.out.println("--------------------");

            if (sc.nextInt() == 1) {
                Scanner sc1 = new Scanner(System.in);
                System.out.println("输入半径：");
                double r = sc1.nextDouble();
                System.out.println("输入x：");
                double x = sc1.nextDouble();
                System.out.println("输入y：");
                double y = sc1.nextDouble();
                System.out.println(yn(x,y,r));
            }
        }
    }


    public static boolean yn(double x,double y,double r){
        int index = 0;
        char[] s =new char[]{'I',' ','l','o','v','e',' ','y','o','u','!'};
        for (double a = x;a >=-4;a-=0.1){

            index = 0;
            for (double b = y;b >=-4;b-=0.1){
                double in = Math.sqrt((x-0)*(x-0)+(y-0)*(y-0));

                return in < r;
            }
            System.out.println();
        }
        return true;
    }
}
