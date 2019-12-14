package ProhorenokBook.Generics;

/**
 * В качесте Т можно указать любой реальный объектный тип, также можем указать два параметра
 * public class BasicClassExample<T1,T2> - использование нескольких типов
 * public class BasicClassExample<T1 extends Number> - ограничение обощенного типа всеми классами, которые наследуют класс Number
 * @param <T>
 */
public class BasicClassExample<T> {
    private T obj;

    public BasicClassExample(T obj) {
        this.obj=obj;
    }
}
