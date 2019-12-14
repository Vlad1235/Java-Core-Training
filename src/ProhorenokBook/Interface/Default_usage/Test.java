package ProhorenokBook.Interface.Default_usage;

public class Test {
    public static void main(String[] args) {
        L obj = new L();
        obj.print(); // даже несмотря на то, что метод нерализован в классе, к нему есть доступ через класс!!!!

        M obj2 = new M();
        obj2.print();
    }
}
/*
hello
Farewell
 */