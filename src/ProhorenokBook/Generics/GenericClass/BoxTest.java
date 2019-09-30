package ProhorenokBook.Generics.GenericClass;

public class BoxTest {
    public static void main(String[] args) {
        Box<String> box = new Box<String>("Строка");
        box.setObj("Строка другая");
        // box.setObj(10) ошибка компиляции
        String s = box.getObj();
        System.out.println(s);
    }
}
