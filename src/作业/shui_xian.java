package 作业;

public class shui_xian {
    public static void main(String[] args) {
all(5);
    }


    //水仙花数
    static int shuixian(){
        int ge;
        int shi;
        int bai;
        for(int i=100;i<=999;i++){
            bai = i/100;
            shi = (i-bai*100)/10;
            ge = i-bai*100-shi*10;
            if(Math.pow(bai,3)+Math.pow(shi,3)+Math.pow(ge,3)==i){
                System.out.println(i);
                return i;
            }
        }
        return 0;
    }


    static void all(int n){
        n=n-1;
        int ci = (int)Math.pow(10,n);

        for(int i=ci;i<=(int)Math.pow(10,n+1)-1;i++){
            int n1 =0;
            int n2 =0;
            int num1;
            int num2 =0;
            int num3;
            for (int j=0;j<=n;j++){
                int c = (i-n2)/(int)Math.pow(10,n-j);//获取位数
//
//                n2 = i -(c* (int) Math.pow(10, n-j));
//                n1 = n1 +c*(int)Math.pow(10,n-j);
                n1 = c*(int)Math.pow(10,n-j);
                n2 = n1+n2;

               // System.out.println(c);
                num1 = (int)Math.pow(c,n+1);
                num2 += num1;
            }
            if(num2==i){
                System.out.println(n2);
            }
           // System.out.println("i："+i);


        }
    }




}
