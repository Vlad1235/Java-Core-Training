package Nasledovanie.Polimorphism2;

public class FindAreas {
    public static void main(String[] args) {
        Figure f  = new Figure(10,10);
        Rectangle r = new Rectangle(6,7);
        Triangle t = new Triangle(10,8);
        Figure z;

        z = r;
        System.out.println("Площадь равна " + z.area());

        z = t;
        System.out.println("Площадь равна " + z.area());

        z = f;
        System.out.println("Площадь равна " + z.area());

    }
}
/*
В области четырехугольника.
Площадь равна 42.0
В области треугольника.
Площадь равна 40.0
Площадь фигуры не определена.
Площадь равна 0.0
 */