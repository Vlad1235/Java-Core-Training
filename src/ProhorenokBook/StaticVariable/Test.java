package ProhorenokBook.StaticVariable;

public class Test {
    private int x;
    private static int z=5;


    private static void statMethod(){
        int y=5;
        z=15;
    }

    private void normMethod(){
        x=15;
        z=25;
    }

    public static void main(String[] args) {
        Test.statMethod();
        System.out.println(z);
    }

}
