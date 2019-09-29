package ProhorenokBook.InnerClass.example2;

/**
 * Общедоступный вложенный класс
 */
public class MyClass {
    public static void main(String[] args) {
        A obj = new A();
        A.B obj2 = obj.new B();         // Создание экземпляра
        obj2.func();
    }
}
/*
A.B.func()
10
 */