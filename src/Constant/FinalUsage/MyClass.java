package Constant.FinalUsage;

/**
 * Доказательство, что невозможно присвоить новое значение финализированной переменной.
 */
public class MyClass {
    public static void main(String[] args) {
        Class1 c = new Class1(10);
        // Только через экземпляр класса
        System.out.println(c.variable); // 10
        Class1 d = new Class1(20);
        System.out.println(d.variable); // 20
        Class1 e = new Class1(30);
        System.out.println(e.variable); // 30
        System.out.println(c.variable); // 10
        System.out.println(d.variable); // 20
        System.out.println(e.variable); // 30
     //   c.variable = 5; Error:(18, 10) java: cannot assign a value to final variable variable
     //   d.variable = 125; Error:(18, 10) java: cannot assign a value to final variable variable
    }
}
