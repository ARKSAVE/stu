package 已完成;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的身高(m)：");
        float gao = sc.nextFloat();
        System.out.println("请输入您的体重(kg)：");
        float zhong = sc.nextFloat();

        float BMI = zhong/(gao*gao);
        if (BMI <= 18.5){
            System.out.println("您的体重过轻，请注意饮食健康");
        }else if (BMI < 24){
            System.out.println("您的体重很健康，请继续保持");

        }else if (BMI < 27){
            System.out.println("您的体重略高，请注意饮食,坚持运动");
        }else if (BMI < 30){
            System.out.println("当前体重轻度肥胖，请注意饮食");
        }else if (BMI < 35){
            System.out.println("当前体重中度肥胖，请注意饮食");
        }else if (BMI >= 35){
            System.out.println("您的体重过高，为重度肥胖，必要时请求助医生");
        }
    }


}
