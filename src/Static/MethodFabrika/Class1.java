package Static.MethodFabrika;

public class Class1 {
    private int x;

    private Class1(int x) {
        this.x = x;
    }
    // Статический метод-фабрика
    public static Class1 getInstance(int x) {
        return new Class1(x);
    }
    public int getX() {
        return this.x;
    }
}
