package ProhorenokBook.InnerClass;


public class InnerClass {
    public int a = 15;
    private int x=10;

    class B{
        public int test(){
            InnerClass g = new InnerClass();
            g.x = 5;
            return g.x;
        }
    }

    public int getX(){
        B gggg = new B();
        int h = gggg.test();
        return h;
    }

    public static void main(String[] args) {
        InnerClass gg = new InnerClass();
        System.out.println(gg.getX());
    }
}
/*
5
 */