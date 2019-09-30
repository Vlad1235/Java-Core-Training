package ProhorenokBook.Object_class.ToString_redefinition;

public class PointTest {
    public static void main(String[] args) {
        Point p = new Point(20, 51);
        System.out.println(p);
        System.out.println(p.toString());
        String s = "" + p;
        System.out.println(s);
        Point f = new Point();
    }
}
/*
[20, 51]
[20, 51]
[20, 51]
No data

 */