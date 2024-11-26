
import java.util.Scanner;

public class gl {


    static String[] zhanghao = new String[10];
    static String[] mima = new String[10];


    public static void main(String[] args) {
        su();
    }

    public static void su() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入超级管理员账号密码");
        String username = sc.nextLine();
        String password = sc.nextLine();
        if (username.equals("1000a") && password.equals("1234a")) {
            System.out.println("登录成功");
            putgl();
        } else {
            System.out.println("账号或密码错误");
        }
    }


    public static void putgl() {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {


            System.out.println("""
                    0. 退出系统
                    1. 录入管理员
                    2. 查找管理员
                    3. 修改管理员
                    4. 删除管理员
                    """);
            switch (sc.nextInt()) {
                case 0:
                    flag = false;
                    break;
                case 1:
                    lr();
                    //录入管理员
                    break;
                case 2:
                    //查找管理员
                    Scanner sc1 = new Scanner(System.in);
                    System.out.println("请输入需要查找的账号");
                    String username = sc1.nextLine();
                    System.out.println(cha(username));
                    break;
                case 3:
                    xg();
                    //修改管理员
                    break;
                case 4:
                    System.out.println("请输入需要删除的账号");
                    Scanner sc2 = new Scanner(System.in);
                    username = sc2.nextLine();
                    if (shan(username)) {
                        System.out.println("删除成功");
                    } else System.out.println("删除失败");
                    //删除管理员
                    break;
            }

        }
    }


    public static void lr() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入需要录入的管理员账号");
        String username = sc.nextLine();
        if (cunzai(username) != -1) {
            System.out.println("账号已存在");
        } else {
            String password = sc.nextLine();
            int is = isnull();
            if (is != -1) {
                zhanghao[is] = username;
                mima[is] = password;
            } else System.out.println("管理员已满");
        }

    }


    public static void xg() {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入修改管理员的账号密码");
        String username = sc.nextLine();
        String password = sc.nextLine();
        boolean czz = false;
        for (int i = 0; i < zhanghao.length; i++) {
            //用于判断是否匹配成功
            if (username.equals(zhanghao[i])) {
                mima[i] = password;
                czz = true;      //匹配到并修改成功
                break;
            }
        }
        if (czz) {    //判断修改密码的代码是否运行
            System.out.println("修改成功");
        } else System.out.println("管理员不存在");
    }

    public static int cunzai(String username) {
        for (int i = 0; i < zhanghao.length; i++) {
            if (zhanghao[i] != null && zhanghao[i].equals(username)) {
                return i;
            }
        }
        return -1;
    }

    public static String cha(String username) {
        int i;

        for (i = 0; i < zhanghao.length; i++) {

            if (zhanghao[i]!=null&&zhanghao[i].equals(username)) {
                return "查找成功，密码为：" + mima[i];
            }
        }
        return "账号不存在";
    }


    public static boolean shan(String username) {
        int suo = cunzai(username);
        if (suo !=  -1) {
            zhanghao[suo] = null;
            mima[suo] = null;
            return true;
        } else {
            System.out.println("账号不存在");
            return false;
        }


    }

    public static int isnull() {
        for (int i = 0; i < zhanghao.length; i++) {
            if (zhanghao[i] == null) {
                return i;
            }
        }
        return -1;
    }




}