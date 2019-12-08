package ProhorenokBook.Interface.DoubleInheritage;

/**
 * Это класс созданный до изменения интерфейса.
 * Как мы видим, тут не требуется реализация нового метода из измененного интерфейса
 */
public class G implements IReadWrite{
    @Override
    public String read(){
        return "строка 4";
    }
    @Override
    public void write(String s){
        System.out.println(s);
    }
}
