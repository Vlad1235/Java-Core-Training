package ProhorenokBook.String_about;

import java.util.Arrays;

/**
 * Вид форматирования строки через шаблоны регулярных выражений.
 */
public class Split_array {
    public static void main(String[] args) {
        String[] arr = "word1.word2.word3.word4.word5".split("[\\s,.]+");
        System.out.println(Arrays.toString(arr));
        arr = "word1.word2.word3.word4.word5".split("[\\s,.]+",3); // с ограничением в оформлении.
        System.out.println(Arrays.toString(arr));
    }
}
/*
[word1, word2, word3, word4, word5]
[word1, word2, word3.word4.word5]
 */