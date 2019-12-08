package ProhorenokBook;

public class Example {
    public static void main(String[] args) {
        int x=5;
        int y=0;
        y=++x + ++x + ++y;
        System.out.println(y);
    }
}
//14  y=++x + ++x + ++y;
//13  y=++x + x++ + ++y;