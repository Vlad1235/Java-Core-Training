package ProhorenokBook.String_about;

/**
 * Использовать для сравнения строк. НЕЛЬЗЯ ИСПОЛЬЗОВАТЬ ==, !=
 */
public class Equal_string {
    public static void main(String[] args) {
        String s1 = "строка", s2 = "строка";
        /*
        Пример ошибки!!! Тут сравниваются ссылки.
         */
        System.out.println(s1==s2); // true
        System.out.println(s1.substring(0,3)==s2.substring(0,3)); //false

        /*
        КАК ПРАВЕЛЬНО!
         */
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.substring(0,3).equals(s2.substring(0,3))); //true
        System.out.println(s1.equals("Строка")); //false

        /*
        Пофиг на регистр
         */
        System.out.println(s1.equalsIgnoreCase("Строка")); //true
        System.out.println(s1.equalsIgnoreCase(s2)); //true

    }
}
/*
true
true
false
 */