package Alishev.basicjava.innerclass;

public class Electrocar2 {
    private int id;
/*
Статический вложенный класс
Такой тип класса имеет гораздо меньше отношения к классу Electrocar2.
Он НЕ имеет доступа к нестатическим полям класса "носителя" Electrocar2.
В остальном не связаны.
Они связаны логикой с классом носителем, чтобы рядом просто был.
 */
    public static class Battery{
         public void charge(){
             System.out.println("Battery is charging...");
         }
    }
    public Electrocar2(int id) {
        this.id = id;
    }
    public void start(){
        System.out.println("Electrocar2" + id + "is starting..");
    }
}
