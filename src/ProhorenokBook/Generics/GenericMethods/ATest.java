package ProhorenokBook.Generics.GenericMethods;

public class ATest {
    public static void main(String[] args) {
        ATest.<Integer>print(10);
        ATest.<String>print("Строка");
        ATest.print(10); // можно и не указывать <>
        ATest.print("Строка");
        A obj = new A();
        ATest.<A>echo(obj);
        ATest.echo(obj);
    }
    /*
    Обощенный метод
     */
    public static <T> void print(T obj){
        System.out.println(obj.toString());
    }
    /*
    Обобщенный метод, ограниченый интерфейсом
     */
    public static <T extends ITest> void echo(T obj){
        obj.print(); // вызов метода из интерфейса
    }
}
/*
10
Строка
10
Строка
X = 20
X = 20
 */