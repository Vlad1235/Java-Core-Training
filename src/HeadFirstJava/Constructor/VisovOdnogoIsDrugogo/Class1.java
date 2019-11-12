package HeadFirstJava.Constructor.VisovOdnogoIsDrugogo;

public class Class1 {
    private int x;
    public Class1(){
        this(25); // вызов одного конструктора из другого. Мы передаем полученный аргумент другому конструктору этого класса
    }
    public Class1(int x){ // конструктор принимает аргумент и совершает действия
        this.x = x;
    }
    public int getX(){
        return this.x; // возвращение значения
    }
}
