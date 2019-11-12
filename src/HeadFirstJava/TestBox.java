package HeadFirstJava;

public class TestBox {
    Integer i;
    int j;

    public static void main(String[] args) {
        TestBox testBox = new TestBox();
        testBox.go();
    }

    public void go(){
        j=i; // не объявлен локальная переменная
        System.out.println(j);
        System.out.println(i);
    }
}
// Exception in thread "main" java.lang.NullPointerException