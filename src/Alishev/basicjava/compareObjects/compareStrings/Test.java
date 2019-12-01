package Alishev.basicjava.compareObjects.compareStrings;

public class Test {
    public static void main(String[] args) {
        String string1 = "Hello";
        String string2 = "Hello";
        System.out.println(string1.equals(string2)); //true
        System.out.println(string1==string2); //true  это работает благодаря StringPool. Если один объект класса стринг уже создан, и мы хотим создать похожий, то компилятор просто нашей новой ссылке дает адрес того предыдущего уже созданного объекта. Это для экономии памяти.
        /*
        ОДНАКО!!!! ЕСЛИ СОЗДАТЬ СПОСОБОМ, КОТОРЫЙ НИЖЕ, ТО МЫ ОТКЛЮЧАЕМ ЭТУ ФУНКЦИЮ В ДЖАВА.
         */
        String s1 = new String("Hello");
        String s2 = new String("Hello");
        System.out.println(s1==s2); // false два РАЗНЫХ ОБЪЕКТА, ОБА ОТДЕЛЬНО ДРУГ ОТ ДРУГА
        System.out.println(s1.equals(s2)); // true


        String s3 = "hello";
        String s4 = "hello123".substring(0,5); // метод для кастрации символов строки с начального по последний невкючительно
        System.out.println(s4);
        System.out.println(s3==s4); //false это способ, когда нас подвел StringPool.
        System.out.println(s3.equals(s4)); //true

        /*
         Для сравнения строк лучше использовать метод equals()
         */

        System.out.println(s3.hashCode()); //99162322
        System.out.println(s4.hashCode()); //99162322
    }
}
