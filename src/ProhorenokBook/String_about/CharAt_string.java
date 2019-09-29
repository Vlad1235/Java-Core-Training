package ProhorenokBook.String_about;

/**
 * Доступ к отдельным символам в строке.
 */
public class CharAt_string {
    public static void main(String[] args) {
        String s = "строка блин";
        char ch;
        ch = s.charAt(0); // указать индекс в массиве String
        System.out.println(ch); // с
        ch = s.charAt(8);
        System.out.println(ch); // л
    }
}
