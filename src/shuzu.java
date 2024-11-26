public class shuzu {
    public static void main(String[] args) {
        String[] strings = new String[10];
        //String[]定义类型：字符串    strings: 名字，可自定义   new String[10] 实例化，并设置数组大小为10
        String[] strings2;
        //创建数组,但不实例化，不能直接使用
        String[] strings3 = new String[]{"小米","华为","vivo"};
        //创建数组并初始化内容，直接初始化内容时不需要设置大小

        int[] ints = new int[10];
        //同上，但是int类型


        ints[0]=1;
        ints[1]=2;
        System.out.println("索引为1的内容为："+ints[1]);
        //ints:数组名字
        //ints[索引]   索引从0开始，比如第一个数据的索引为0，第二个的索引为1
        ints[1]=3;
        System.out.println("索引为1的内容为："+ints[1]);
        //可以直接修改已经有内容的地方



        String[] sj = new String[]{"小米","华为","vivo","oppo","索尼"};

        for (int i = 0; i < sj.length; i++) {
            //第一个参数是初始化条件，第二个参数是判断条件，当条件为true时会运行里面的代码，第三个参数是修改条件的变量
            //sj.length 是获取sj数组的长度
            System.out.println("索引为"+i+"的数据为："+sj[i]);
            //这里循环获取sj数组中索引为i的数据
        }



        int[] px = new int[]{1,10086,8,6,2,4,7,9,3};
        //排序当前数组
        for (int i = 0; i < px.length; i++) {
            for (int j = 0; j < px.length-i-1; j++) {
                if (px[j]>px[j+1]) {//当前面的数据大于后面的数据
                    int temp = px[j];
                    //暂存这个数据
                    px[j] = px[j+1];
                    //把j+1的数据往前排一位
                    px[j+1] = temp;
                    //使暂存的数据往后排一位


                }
            }

        }
        for (int i = 0; i < px.length; i++) {
            System.out.println(px[i]);
            //输出排序后的数组
        }

    }
}
