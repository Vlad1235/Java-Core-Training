package ProhorenokBook.Interface.DoubleInheritage;

/**
 * Если нам нужен новый метод в уже рабочем интерфейсе мы не можем просто его добавить, иначе
 * этот новый метод должны будут переопределить все, что уже наследовал от него методы
 * Поэтому придуман default метод, который добавляется в интерфейс и новые классы, которые переопределяют
 * этот интерфейс уже должны будут реализовать и старые методы интерфейса, но и новый метод
 *
 * Это удобно, чтобы НЕ ломать уже старые классы!
 *
 * Это класс уже созданный после.
 */
public class N implements IReadWrite {
    @Override
    public String read(){
        return "строка 4";
    }
    @Override
    public void write(String s){
        System.out.println(s);
    }

    public void speak(){
        System.out.println("Проверка, что default метод работает!!!");
    }
}
