package ProhorenokBook.InnerClass.example1;

/**
 * Вложенные классы
 */
public class MyClass {
    public static void main(String[] args) {
        A obj = new A(10);
        obj.func();
    }
}
/*
A.func()
A.B.func()
10
10
 */