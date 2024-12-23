package 练习.接口.图形计算;

public interface API {

    void s();
    void v();



}

class yuan implements API{
    public float r = 0f;
    public yuan(float r) {
       this.r = r;
    }


    @Override
    public void s() {
        float yuanv = 2f*(float)Math.PI*r*r;
        System.out.println("圆的面积为："+yuanv);
    }

    @Override
    public void v() {
        float yuans = 2f*(float)Math.PI*r;
        System.out.println("圆的周长为："+yuans);

    }
}


class ju implements API{
    public float h = 0f;
    public float w = 0f;
    public ju(float h, float w) {
        this.h = h;
        this.w = w;

    }


    @Override
    public void s() {
        System.out.println("矩形的周长为："+(h+w)*2);
    }

    @Override
    public void v() {
        System.out.println("矩形的面积为："+(h*w));

    }
}
