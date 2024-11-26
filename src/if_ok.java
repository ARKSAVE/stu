public class if_ok {
    public static void main(String[] args) {
        float a = 13.1f;
        float b = 45.25f;
        float c = 13.4f;
        //以上声明并赋值float类型变量
        if (a == 11.5f){
            //判断变量a是否等于11.5
            //是则运行下面的代码，不是则运行下一个else if或else（以下同理）
            System.out.println("a == 11.5f");
        }else if (b == 16.25f){
            //否则 判断变量b是否等于16.25
            System.out.println("b == 16.25f");
        }else if (c == 17.5f){
            //否则  判断变量c是否等于17.5
            System.out.println("c == 17.5f");
        }else {
            //当以上判断都不成立的情况下运行else内代码
            System.out.println("都不是");
            String d = "正确的应该是：a="+a +",b="+ b +",c="+ c;
            //申明String类型变量d，并赋值字符串与变量的拼接结果
            System.out.println(d);
            System.out.println(a != 1);

            //输出拼接后的结果
            //别问我上面的为什么不注释，不注释才显眼（需要运行就把上面那行注释一下
            int ae = 72;
            int be = 105;
            int ce = 65281;
            // FIXME:
            String s = "" + (char)ae + (char)be + (char)ce;
            System.out.println(s);
        }

        if (a > 10 ||a < 9) {
            System.out.println("a大于10或小于9");
        }
        if (a > 10 && b > 20){
            System.out.println("a大于10，b小于20");
        }
        int in = 0;
        while (in != 9){
        in += 1;
            System.out.println(in);
        }
    }
}
