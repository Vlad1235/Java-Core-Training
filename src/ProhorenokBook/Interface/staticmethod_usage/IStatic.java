package ProhorenokBook.Interface.staticmethod_usage;
/*
В интерфейсе можно реализовать статический метод. Однако переопределить такие методы далее в реализующих интрефейс классах НЕЛЬЗЯ.
Просто вызывать можно
Начиная с Java 9 один из статических методов можно объявить закрытым и он будет ввидет лишь внутри интерфейса
 */
public interface IStatic {
    static void test(){
        print();
    }
    private static void print(){
        System.out.println("Привет из статического метода");
    }
}
