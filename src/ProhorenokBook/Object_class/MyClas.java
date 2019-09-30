package ProhorenokBook.Object_class;

import ProhorenokBook.Object_class.equals_redefinition.Point;

/**
 * Использование getClass() для вызова метода getName()
 */
public class MyClas {
    public static void main(String[] args) {
        Point p1 = new Point(20,51);
        System.out.println(p1.getClass().getName()); // ProhorenokBook.Object_class.equals_redefinition.Point
    }
}