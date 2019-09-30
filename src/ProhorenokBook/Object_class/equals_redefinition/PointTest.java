package ProhorenokBook.Object_class.equals_redefinition;

public class PointTest {
    public static void main(String[] args) {
        Point p1 = new Point(20,51);
        Point p2 = new Point(20,51);
        Point p3 = new Point(1,51);
        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));
        p1 = p3;
        System.out.println(p1.equals(p3));
    }
}
/*
true
false
true
 */