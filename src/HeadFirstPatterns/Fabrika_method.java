package HeadFirstPatterns;

/**
 * Метод фабрика для создания новых экземпляров класса
 */
public class Fabrika_method {
    private int x;

    private Fabrika_method(int x) {
        this.x = x;
    }

    public static Fabrika_method getInstance(int x){
        return new Fabrika_method(x);
    }

}
