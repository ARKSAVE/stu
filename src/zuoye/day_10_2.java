package zuoye;

public class day_10_2 {
    public static void main(String[] args) {
        int b = 123;
        abc bc = new d(b);
        bc.run();

    }

}

class abc {
    public void getB() {

    }

    public void run() {

        System.out.println(1111);
    }


}

class b extends abc {
    public b(int a) {
    }

    public void run() {

    }
}

class c extends abc {
    public void run() {

    }
}

class d extends abc {
    public d(int b){

       this.b = b;
        System.out.println(b);
    }
 int b ;


    //public  d(int b){}


    public void run() {
        System.out.println( b);
    }
}