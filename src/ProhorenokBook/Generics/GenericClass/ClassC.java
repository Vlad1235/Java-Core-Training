package ProhorenokBook.Generics.GenericClass;

/**
 * Ограничение обощенного типа. Например, огроничим обощенный тип классами, производными от класса Number,
 * Классы Integer и Double производные от класса, поэтому их можно использовать.
 */
public class ClassC < T extends Number> {
    public T obj;

    public ClassC(T obj){
        this.obj = obj;
    }

    public static void main(String[] args) {
        ClassC<Integer> c1 = new ClassC<>(10); // начиная с джава 7 можно второй ромбик не заполнять.
        System.out.println(c1.obj);
        ClassC<Double> c2 = new ClassC<>(10.5);
        System.out.println(c2.obj);
       // ClassC<Date> c = new ClassC<Date>(new Date()); ошибка, так как класс Number не реализует класс Date
    }
}
/*
10
10.5
 */