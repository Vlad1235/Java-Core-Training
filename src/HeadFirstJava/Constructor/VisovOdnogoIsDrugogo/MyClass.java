package HeadFirstJava.Constructor.VisovOdnogoIsDrugogo;

/**
 * Вызов одного конструктора из другого.
 */
public class MyClass {
    public static void main(String[] args) {
        Class1 c = new Class1();
        System.out.println(c.getX());
        c = new Class1(33);
        System.out.println(c.getX());
    }
}
/*
25
33
 */