package ProhorenokBook.InnerClass.example1;

public class A {
    private B b;
    private int x;

    public A(int x) {
        this.b = this.new B(); // или this.b = new B();
        // или this.b = new A.B();
        this.x = x;
    }

    public void func() {
        System.out.println("A.func()");
        b.func();
    }

    private class B {                   // Вложенный класс
        public void func() {
            System.out.println("A.B.func()");
            System.out.println(A.this.x); // Доступ к A.x
            System.out.println(x);        // Можно и так
        }
    }
}
