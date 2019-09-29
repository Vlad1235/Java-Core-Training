package ProhorenokBook.Nasledovanie.Constructor;

/**
 * Передача значений конструкторам базовых классов
 */
public class MyClass {
    public static void main(String[] args) {
        C obj = new C(10, 20, 30);
        System.out.println("A.x = " + obj.x +
                "; B.y = " + obj.x + "; C.z = " + obj.z);
    }
}
/*
A.A()
B.B()
C.C()
A.x = 10; B.y = 10; C.z = 30
 */