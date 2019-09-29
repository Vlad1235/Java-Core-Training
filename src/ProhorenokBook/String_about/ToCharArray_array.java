package ProhorenokBook.String_about;

import java.util.Arrays;

/**
 * Преобразование строки в массив типа char[].
 */
public class ToCharArray_array {
    public static void main(String[] args) {
        String s = "строка";
        char[] arr = s.toCharArray();
        System.out.println(Arrays.toString(arr));
    }
}
/*
[с, т, р, о, к, а]
 */