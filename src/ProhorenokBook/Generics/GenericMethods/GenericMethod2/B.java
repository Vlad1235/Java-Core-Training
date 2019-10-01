package ProhorenokBook.Generics.GenericMethods.GenericMethod2;

public class B <T> {
    private T obj;
    /*
    Обобщенный тип в параметре конструктора
     */
    public B(T obj){
        this.obj = obj;
    }
    /*
    Дополнительный обобщенный тип
     */
    public <U> void print(T obj1, U obj2){
        System.out.println(obj1.toString());
        System.out.println(obj2.toString());
        System.out.println(this.obj.toString());
    }
}
