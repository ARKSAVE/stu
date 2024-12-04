import java.util.Scanner;

public class sssss {
    public static void main(String[] args) {


                Scanner sc = new Scanner(System.in);
                int gb = 1000;
                int flag = 0;
                int t = 1;
                int f = 2;
                System.out.println("欢迎使用中国人民银行ATM取款机");
                do{

                    System.out.println("输入取款金额：");
                    int a = sc.nextInt();
                    if(gb>=a){
                        gb-=a;
                        System.out.println("剩余金额："+gb+"，是否继续（'1'：结束，'2'：继续）：");
                        flag = sc.nextInt();
                    }else {
                        System.out.print("目前余额："+a+"无法满足您的取款需求！");
                        flag = 1;
                    }

                }while(flag==1);
                System.out.println("取款结束！");




                /*****end*****/
            }
        }

