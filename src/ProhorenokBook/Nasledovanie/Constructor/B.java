package ProhorenokBook.Nasledovanie.Constructor;

public class B extends A {
    public int y;
    public B(int x, int y) {         // Конструктор
        super(x);                     // Вызов A.A(x)
        this.y = y;
        System.out.println("B.B()");
    }
}
