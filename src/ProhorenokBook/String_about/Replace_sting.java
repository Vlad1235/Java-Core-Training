package ProhorenokBook.String_about;

/**
 * Замена одних символов или строк на другие. Возвращает новую строку.
 */
public class Replace_sting {
    public static void main(String[] args) {
        String s = " Маша, я тебя люблю";
        System.out.println(s.replace("Маша","Даша")); //Даша, я тебя люблю
        String s1 = "strstrstrstrN";
        System.out.println(s1.replace("str","")); // N
    }
}
