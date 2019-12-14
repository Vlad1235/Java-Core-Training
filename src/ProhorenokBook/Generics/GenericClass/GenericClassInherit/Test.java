package ProhorenokBook.Generics.GenericClass.GenericClassInherit;

public class Test {
    public static void main(String[] args) {
        B<Integer,Double> obj = new B<>(10,5.6);
        obj.test();
        int x = obj.getObj();
        double y = obj.getN();
        System.out.println("x = " + x + " y = " + y);

        C<Integer> obj1 = new C<Integer>(10,5);
        obj1.test();
        int z = obj1.getObj();
        int v = obj1.getX();
        System.out.println("z = " + z + " v = " + v);

        D obj3 = new D(10,5,3);
        obj3.test();
        int j = obj3.getObj();
        int k = obj3.getX();
        int h = obj3.getY();
        System.out.println("j = " + j + " k = " + k + " h = " + h);

        /*
        Можно объявить переменную с использованием маски типа и указать класс Number в качестве базового типа. Только таким способом!
        A<Number> q = new A<Integer>(10); и подобноми будет ошибка!
        Полиморфизм не учитывает наследственность обощенного типа! Поэтому стандрартными приемами полиморфизма нельзя
        < ? extends Number> - указывает что тип не Number, а любой (нужный нам например Integer) наследованный от него.
         */
        A< ? extends Number> q = new A<Integer>(10);
        A< ? extends Number> w = new A<Long>(10L);
        A< ? extends Number> e = new A<Double>(10.2);
        A< ? extends Number> r = new C<Integer>(10,5);
        A< ? extends Number> t = new D(10,5,3);

    }
}
/*
A obj = 10
B n = 5.6
x = 10 y = 5.6
A obj = 10
C x = 5
z = 10 v = 5
A obj = 10
C x = 5
D y = 3
j = 10 k = 5 h = 3
 */