package ProhorenokBook.Generics.GenericMethods.GenericMethod2;

public class A {
    /*
    Обощенный метод внутри обычного класса
     */
    public <T> void print(T obj){
        System.out.println(obj.toString());
    }
}
