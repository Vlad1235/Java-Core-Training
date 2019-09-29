package Static.MethodFabrika;

/**
 * Метод-фабрика
 */
public class MyClass {
    public static void main(String[] args) {
        // Так нельзя, у конструктора модификатор private
        // Class1 c1 = new Class1(10);
        Class1 c2 = Class1.getInstance(10);
        Class1 c3 = Class1.getInstance(45);
        System.out.println(c2.getX());  // 10
        System.out.println(c3.getX());  // 45
    }
}
/*
10
45
 */