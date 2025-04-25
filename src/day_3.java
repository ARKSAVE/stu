import java.util.Random;

public class day_3 {
    public static void main(String[] args) {
        boolean flag = true;
        int num = 0;
        Random rand = new Random();
        rand.nextInt(100);
        while (flag) {
            if (num<3){
                num++;
                System.out.println(num);
            }else if(num==3){
                flag = false;
            }
        }


       int numi = 0;
        boolean flag2 = true;
        do {
            numi++;
            System.out.println("-------------");
            System.out.println(numi);
            if (numi ==3){
                flag2 = false;
            }
        }while (flag2);




        for (int a = 0; a < 5 ; a++){
            System.out.println(a);
        }



        int[]ew = {12,35,25,168,52
        };
        for (int i = 0; i < ew.length; i++) {
            System.out.println(ew[i]);
        }
    }
}
