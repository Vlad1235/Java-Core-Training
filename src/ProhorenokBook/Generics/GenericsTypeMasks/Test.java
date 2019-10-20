package ProhorenokBook.Generics.GenericsTypeMasks;

public class Test {
    public static void main(String[] args) {
        Box<Integer> obj1 = new Box<Integer>(10);
        Box<Double> obj2 = new Box<Double>(5.6);
        Test.print1(obj1);           // 10
        // Можно только Box<Integer>
        // MyDialog.print1(obj2);
        Test.print2(obj1);           // 10
        Test.print2(obj2);           // 5.6
        Test.print3(obj1);           // 10.0
        Test.print3(obj2);           // 5.6
        Test.print4(obj1);           // 10.0
        Test.print4(obj2);           // 5.6
        Test.print5(obj1);           // 10
        // Можно только Box<Integer> и Box<Number>
        // MyDialog.print5(obj2);
        Box<Number> obj3 = new Box<Number>(5.6);
        Test.print5(obj3);           // 5.6
    }

    public static void print1(Box<Integer> obj) {
        System.out.println(obj.getObj().intValue());
    }
    // Любые типы
    public static void print2(Box<?> obj) {
        System.out.println(obj.getObj().toString());
    }
    // Класс Number и производные классы
    public static void print3(Box<? extends Number> obj) { // <? extends Number> использование маски типов. Мы ничего не знаем об исходном типе
        System.out.println(obj.getObj().doubleValue());
        // Тип не знаем
        // obj.setObj(obj.getObj()); // Ошибка
    }
    // Класс Number и производные классы
    public static <T extends Number> void print4(Box<T> obj) { // <T extends Number> ограничение обобщенного типа. Знаем тип Т и можем изменить объект
        System.out.println(obj.getObj().doubleValue());
        // Дополнительно знаем тип T
        obj.setObj(obj.getObj());     // OK
    }
    // Класс Integer и базовые классы (Number и Object)
    public static void print5(Box<? super Integer> obj) {
        System.out.println(obj.getObj().toString());
    }

}
