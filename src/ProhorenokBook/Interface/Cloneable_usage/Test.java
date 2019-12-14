package ProhorenokBook.Interface.Cloneable_usage;

public class Test {
    public static void main(String[] args) {
        A obj1 = new A(10);
        A obj2 = obj1.clone(); // клонируем объект класса А obj1
        System.out.println(obj1.getD());
        System.out.println(obj2.getD());
        obj2.newDate(1245L);
        System.out.println(obj1.getD()); // изменений нет! Это то, что нужно
        System.out.println(obj2.getD());
    }
}
/*
Mon Sep 30 23:32:16 JST 2019
Mon Sep 30 23:32:16 JST 2019
Mon Sep 30 23:32:16 JST 2019
Thu Jan 01 09:00:01 JST 1970
 */