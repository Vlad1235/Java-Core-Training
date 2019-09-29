package ProhorenokBook.StaticVariable.StatManyInOne;

public class Stat2 {
    static int two;

    public static void main(String[] args) {
        two = 10;
        System.out.println(two);
        Stat1 stat1 = new Stat1();
        System.out.println(stat1.getFigure());
    }
}
