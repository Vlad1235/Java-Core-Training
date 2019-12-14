package ProhorenokBook.important;

/**
 * Пример как нарушается инкапсуляция через статический метод, если он находится в классе
 *
 * ПРАВИЛО сам вывел!!! не размещать статические методы в Классе!!!!
 */
public class MyClass {
    public static void main(String[] args) {
        A obj = new A();
        A.func(obj); // передаем экземпляр класса в метод
        MyClass.func(obj);
        System.out.println(obj.s);
        System.out.println(obj.getX());
    }

    public static void func(A obj) {
        System.out.println(obj.s); // она public к ней доступ есть
        // System.out.println(obj.x); супер, нету доступа у этого статического метода к приватным полям класса
        System.out.println(obj.getX()); // доступ через геттер это нормально, именно доступ, а изменить нельзя (сеттеров нет)
        System.out.println(obj.s);
        obj.s = "Новая строка!";
    }

}


class A {
    private int x = 10;
    public String s = "Строка";


        public static void func(A obj) {
            System.out.println(obj.x); // .....!!!! у нее есть доступ к закрытой нестатической переменной!
            System.out.println(obj.s);
            obj.x = 100; // ее можно изменить!
        }


    public int getX() { // официальный способ доступа
        return x;
    }
}
/*
10
Строка
Строка
100
Строка
Новая строка!
100
 */