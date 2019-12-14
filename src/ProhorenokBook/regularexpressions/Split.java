package ProhorenokBook.regularexpressions;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Метод String[] split() класса Pattern разбивает строку по шаблону и возвращает массив подстрок
 */
public class Split {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("[\\s,.]+");
        String[] arr = p.split("word1, word2\nword3\r\nword4.word5");
        System.out.println(Arrays.toString(arr));
    }
}
// [word1, word2, word3, word4, word5]