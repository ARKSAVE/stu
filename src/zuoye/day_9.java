package zuoye;
//水仙花数
public class day_9 {
    public static void main(String[] args) {
       siye();
    }


    static void shuixian(){
        for (int num= 100;num<=999;num++){
            if(sx(num)){
                System.out.printf("水仙花数有：%d\n",num);
            }
        }
    }

    static boolean sx(int num){
        int a = num / 100;
        int b = (num - a*100) /10;
        int c = num - a*100 - b*10;

        int shu = a*a*a + b*b*b + c*c*c;
        if(shu==num){
            return true;
        }else return false;
    }





    static void siye(){
        for (int num = 1000;num<=9999;num++){
            if(sy(num)) {

                System.out.printf("四叶玫瑰数有：%d\n", num);
            }
        }
    }


    static boolean sy(int num){
        int a = num / 1000;
        int b = (num - a*1000) /100;
        int c = (num - a*1000 - b*100)/10;
        int d = (num - a*1000 - b*100 - c*10);
        int e = a*a*a*a + b*b*b*b + c*c*c*c + d*d*d*d;
        if(e==num){
            return true;
        }else return false;


    }
}
