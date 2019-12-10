package ProhorenokBook.Generics.GenericClass.GenericClass_via_Interface;

public class MyClass {
    public static void main(String[] args) {
        ClassA<Class_A> c = new ClassA<>(new Class_A());
        c.test();
    }
}
/*
test1()
test2()
 */