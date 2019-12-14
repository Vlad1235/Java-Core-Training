package ProhorenokBook.Interface.DoubleInheritage;


/**
 * Интрефейсы единственные, кто имееют возможность множенственного наследования.
 */
public class Test {
    public static void main(String[] args) {
        G rw = new G();
        System.out.println(rw.MY_CONST); // в одном из интерфейсов она определена
        D obj1 = new D(rw, rw);
        obj1.change();
        obj1.print();
        N obj3 = new N();
        obj3.speak();
    }
}
/*
10
СТРОКА 4
Проверка, что default метод работает!!!
 */