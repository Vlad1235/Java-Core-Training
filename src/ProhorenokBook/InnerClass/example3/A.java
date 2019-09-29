package ProhorenokBook.InnerClass.example3;

public class A {
    private static int x = 10;
    private B obj = new B();
    public void func() {
        System.out.println("A.func()");
        obj.func();
    }
    public void makeClassB(){
        new B();
    }

    private static class B {    // Статический вложенный класс
        public void func() {
            System.out.println("A.B.func()");
            System.out.println(x);
        }
    }
}
