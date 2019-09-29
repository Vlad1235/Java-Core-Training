package ProhorenokBook.String_about;

/**
 * Удаляет пробелы в начале и конце строки.
 */
public class Trim_string {
    public static void main(String[] args) {
        String s = "  ты дура  ";
        System.out.println(s.trim());
        String s1 = " you are an idiot \n + emptySpace";
        System.out.println(s1);
        System.out.println(s1.trim());
    }
}
/*
ты дура
 you are an idiot
 + emptySpace
you are an idiot
 + emptySpace
 */