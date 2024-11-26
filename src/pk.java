import java.util.Random;
import java.util.Scanner;

@SuppressWarnings("StringEquality")
class pk {


        public static void main(String[] args) {
            run();
        }


        public static void run(){
            Scanner sc = new Scanner(System.in);
            System.out.println("""
                输入数字：
                1：剪刀
                2：石头
                3：布""");
            String s = "";
            switch (sc.nextInt()) {
                case 1:
                    s = "石头";
                    break;
                case 2:
                    s = "剪刀";
                    break;
                case 3:
                    s = "布";
                    break;
                default:
                    System.out.println("输入错误");
            }
            if (s != "") {
                System.out.println("输入的是" + s);
            }
            String ni = s;
            String ai = ai();
            System.out.println("你输入的是：" + ni + "\nAI输入的是：" + ai);
            sf(ai,ni);
            Scanner ag = new Scanner(System.in);

            System.out.println("再来一局吗？（y/n)");
            if (ag.next().charAt(0) == 'y') {
                run();
            }


        }

        public static String sf(String ai, String ni) {
            String back = "";
            switch (ai) {
                case "石头":
                    //noinspection StringEquality
                    if (ni == "布"){
                        System.out.println("恭喜，你赢了");
                    } else if (ni == "剪刀") {
                        System.out.println("十分遗憾，你输了");
                    } else if (ai == ni) {
                        System.out.println("平局了，势均力敌的对手");
                    }
                    break;
                case "布":
                    if (ni == "剪刀"){
                        System.out.println("恭喜，你赢了");
                    } else if (ni == "石头") {
                        System.out.println("十分遗憾，你输了");
                    } else if (ai == ni) {
                        System.out.println("平局了，势均力敌的对手");
                    }
                    break;
                case "剪刀":
                    if (ni == "石头"){
                        System.out.println("恭喜，你赢了");
                    } else if (ni == "布") {
                        System.out.println("十分遗憾，你输了");
                    } else if (ai == ni) {
                        System.out.println("平局了，势均力敌的对手");
                    }
                    break;
            }


        /*
                   if (ai == "石头"&& ni == "布"){
            System.out.println("恭喜，你赢了");
        } else if (ai == "石头" && ni == "剪刀") {
            System.out.println("十分遗憾，你输了");
        } else if (ai == ) {

        }
        */
            return back;
        }



        public static String ai(){
            Random r = new Random();
            int i = r.nextInt(2);
            String[] s = {"石头","剪刀","布"};
            return s[i];
        }
    }

