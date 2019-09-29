package ProhorenokBook.String_about;

/**
 * Возвращает true если строка начинается с указанного фрагмента.
 */
public class StartWith_string {
    public static void main(String[] args) {
        System.out.println("Влад".startsWith("Вл",0)); //true
        System.out.println("Владислав".startsWith("дис",3)); // true
    }
}
