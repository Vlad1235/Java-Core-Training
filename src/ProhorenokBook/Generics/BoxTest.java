package ProhorenokBook.Generics;

/**
 * Мы создаем любой тип экземпляра класса Box и затем через привидение типов меняем на нужный нам тип.
 */
public class BoxTest {
    public static void main(String[] args) {
        Box box1 = new Box("Строка");
        Box box2 = new Box(10);
        String s = (String) box1.getObj();
        int x = (int) box2.getObj();
        System.out.println(s);
        System.out.println(x);
        /*
        Вариант более безопасный ниже
         */
        Box box = new Box("Строка");
        box.setObj(10); // легко можем изменить значение со строки на число
        String c = "";
        int v = 0;
        if (box.getObj() instanceof String){
            c = (String) box.getObj();
            System.out.println(c);
        } else if (box.getObj().getClass() == Integer.class){
            v = (int) box.getObj();
            System.out.println(v); // 10
        }
    }
}
/*
Строка
10
10
 */