package ProhorenokBook.String_about;

/**
 * Сравнивает строку х со строкой у и возвращает либо
 * отриц число(х меньше у), 0 - если они равны и отриц число если х больше у
 */
public class CompareTo_string {
    public static void main(String[] args) {
        String s1 = "строка", s2 = "строка";
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.substring(0,2).compareTo(s2.substring(0,3)));
        System.out.println("абв".compareTo("абв")); // с учетом регистра
        System.out.println("абВ".compareTo("абв"));
        System.out.println("абю".compareTo("абя"));
        System.out.println("абВ".compareToIgnoreCase("абв"));// без учета регистра символов сравнение
        System.out.println(s1.isEmpty()); //false
    }
}
/*
0
-1
0
-32
-1
0
 */