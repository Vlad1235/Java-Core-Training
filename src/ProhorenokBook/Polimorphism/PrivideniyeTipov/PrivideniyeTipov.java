package ProhorenokBook.Polimorphism.PrivideniyeTipov;

public class PrivideniyeTipov {
    public static void main(String[] args) {
        A objA = new A();
        B objB = new B();
        C objC = new C();
        objA.func();
        objB.func();
        objC.func();
        A obj1 = new A();
        A obj2 = new B();
        A obj3 = new C();
        obj1.func();
        obj2.func();
        obj3.func();
      //  obj3.func2();  отсутствует в базовом классе метод func2()
        if (obj3 instanceof C){
            ((C)obj3).func2(); //привидение типа к указанному значению
        }
    }
}
/*
A.func()
B.func()
C.func()
A.func()
B.func()
C.func()
C.func2()
 */