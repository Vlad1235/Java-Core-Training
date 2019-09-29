package Info_to_method;

/**
 * Пример, что метод не изменяет инициализированную переменную назад. То есть значение изначальное так и осталось.
 */
public class XCopy {
    int go(int arg){
        arg = arg*2;
        return arg;
    }
    public static void main(String[] args) {
        int orig = 42;
        XCopy x = new XCopy();
        int y =x.go(orig);
        System.out.println(orig + " " + y);
    }
}
// 42 84