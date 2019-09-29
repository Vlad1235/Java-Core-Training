package ProhorenokBook.Nasledovanie.Constructor;

public class C extends B {
    public int z;
    public C(int x, int y, int z) {  // Конструктор
        super(x, y);                  // Вызов B.B(x, y)
        this.z = z;
        System.out.println("C.C()");
    }
}
