package ProhorenokBook.Object_class.hashCode_redefinition;


public class PointTest {
    public static void main(String[] args) {
        Point p1 = new Point(20,51);
        Point p2 = new Point(20,51);
        Point p3 = new Point(51,20);
        System.out.println(p1.hashCode()); // одинковые координаты, одинаковый хэш. Это возможно лишь из-за переопределения
        System.out.println(p2.hashCode()); // одинковые координаты, одинаковый хэш. Это возможно лишь из-за переопределения
        System.out.println(p3.hashCode());

    }
}
/*
1632
1632
2562
 */