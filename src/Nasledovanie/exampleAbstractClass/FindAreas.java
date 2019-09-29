package Nasledovanie.exampleAbstractClass;

public class FindAreas {
    public static void main(String[] args) {
     //   Figure f  = new Figure(10,10);
        Rectangle r = new Rectangle(6,7);
        Triangle t = new Triangle(10,8);
        Figure z;

        z = r;
        System.out.println("Площадь равна " + z.area());
        System.out.println("Сумма равна " + z.sum());

        z = t;
        System.out.println("Площадь равна " + z.area());
        System.out.println("Сумма равна " + z.sum());
    }
}
/*
В области четырехугольника.
Площадь равна 42.0
Сумма + 10
Сумма равна 23
В области треугольника.
Площадь равна 40.0
Сумма + 20
Сумма равна 38
 */