package ProhorenokBook.InnerClass.example2;

public class A {
    private int x = 10;

    public class B {                   // Вложенный класс
        public void func() {
            System.out.println("A.B.func()");
            System.out.println(A.this.x);
        }
    }
}
