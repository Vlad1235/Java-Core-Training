package ProhorenokBook.String_about;

/**
 * Получение фрагмента сроки
 */
public class Substring_string {
    public static void main(String[] args) {
        char[] charArr = new char[]{'с', 'т', 'р', 'о', 'к', 'а'};
        String s = new String(charArr);
        System.out.println(s.substring(3,5)); // ок

        String q = "hello, world";
        System.out.println(q.substring(3,9)); // lo, wo

    }
}
