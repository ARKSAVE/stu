package zuoye;

/*
 *
 *
 * 銀行收銀功能
 */
//这是利用hashMap写的管理系统

import java.util.HashMap;
import java.util.Scanner;

/*
 * 1:收录功能    超市新的品类收录，商品id，商品的名字，商品的价格， 删除功能
 * 2：收银功能   循环收录当前订单的商品，然后计算出总额
 * 3：管理员系统  管理员账号的录入   删除，修改，查找
 * <1 录入 ，持久化保存（保存成一种文件，  txt  yaml  使用数据库 mysql）
 * 持久化保存   使用数组（array），
 */
public class day_7 {


    private static int[] zhanghao = new int[10];
    private static HashMap<Integer, Integer> zhanghaoMap = new HashMap<>();


    private static String[] zhanghaoStr = new String[10];
    private static HashMap<String, Float> shangpinMap = new HashMap<>();


    public static void main(String[] args) {
        int zhanghao = 1000;
        int mima = 1234;


        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("请输入你需要的功能\n1. 超级登录管理系统\n2.管理员登录\n0. 退出系统\n");
            switch (sc.nextInt()) {
                case 1:
                    System.out.println("请输入root管理员账号密码：");
                    int username = sc.nextInt();
                    int password = sc.nextInt();
                    if (Confirm(username, password)) {
                        //进入管理员系统
                        su();
                    }
                    break;
                case 2:
                    if (zhanghaoMap.size() != 0) {

                        if (Confirm1()) {
                            //普通管理员系统需要另写！！！！！！！！！！！！！！注意
                            //进入管理员系统
                            su1();
                        }
                    } else System.out.println("管理员列表为空");
                    break;
                case 0:
                    flag = false;
                    System.out.println("正在退出...");
                    break;
            }
        }


    }


    static boolean Confirm(int username, int password) {
        if (username == 1000 && password == 1234) {
            System.out.println("账号密码正确");
            return true;

        } else {
            System.out.println("账号或密码错误");
            return false;
        }
    }

    static boolean Confirm1() {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("请输入管理员账号密码：");
            int zhanghao = sc.nextInt();
            if (zhanghao == 0){
                return false;
            }
            int mima = sc.nextInt();


            if (zhanghaoMap.containsKey(zhanghao)) {
                if (zhanghaoMap.get(zhanghao) == mima) {
                    System.out.println("管理员登录成功");
                    return true;
                }
            }
            System.out.println("账号或密码错误");
        }
        return false;
    }


    static void su() {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("""
                    请输入需要的功能
                    0, 退出功能
                    1, 录入管理员
                    2， 删除管理员
                    3， 修改管理员
                    4， 查找管理员""");
            switch (sc.nextInt()) {
                case 0:
                    flag = false;
                    break;
                case 1:
                    //录入管理
                    System.out.println("输入新增的管理员账号密码：");
                    int zhanghao = sc.nextInt();
                    int mima = sc.nextInt();
                    zhanghaoMap.put(zhanghao, mima);
                    System.out.println(zhanghaoMap);

                    /**
                     * 这里是新增2级管理员账号密码，储存在zhanghaoMap中
                     */
                    break;
                case 2:
                    System.out.println("请输入需要删除的账号：");
                    int zhanghao2 = sc.nextInt();
                    zhanghaoMap.remove(zhanghao2);
                    System.out.println(zhanghaoMap);
                    //删除管理员
                    break;
                case 3:


                    System.out.println("输入需要修改的账号和修改后的密码");
                    int zhanghao3 = sc.nextInt();
                    int mima3 = sc.nextInt();
                    if (zhanghaoMap.containsKey(zhanghao3)) {
                        zhanghaoMap.replace(zhanghao3, mima3);
                    } else {
                        System.out.println("当前账号不存在");

                    }

                    //修改管理员
                    break;
                case 4:

                    System.out.println("输入需要找回的账号：");
                    int zhanghao4 = sc.nextInt();

                    if (zhanghaoMap.containsKey(zhanghao4)) {
                        int zhaohui = zhanghaoMap.get(zhanghao4);
                        System.out.println(zhaohui);
                    } else {
                        System.out.println("当前账号不存在");

                    }

                    //查找管理员
                    break;
            }
        }
    }


    static void su1() {
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        while (flag) {
            System.out.println("管理功能区");

            switch (sc.nextInt()) {
                case 0:
                    flag = false;
                    break;

            }
        }

    }


    static void gl() {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("""
                    选择管理功能：
                    0. 退出功能
                    1. 收录商品
                    2. 开始收银
                    """);
            switch (sc.nextInt()) {
                case 1:
                    System.out.println("输入商品名称与价格：");
                    String shangpin = sc.nextLine();
                    Float jiage = sc.nextFloat();
                    shangpinMap.put(shangpin, jiage);
                    System.out.println(shangpinMap);
                    break;
                case 2:
                    for (String name : shangpinMap.keySet()) {
                        int tip = 1;
                        System.out.printf(tip + ". " + name + ": " + shangpinMap.get(name));
                    }
                    break;
                case 0:
                    flag = false;
                    break;
            }
        }
    }
}
