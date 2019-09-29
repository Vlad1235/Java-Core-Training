package ProhorenokBook.String_about;

import java.nio.charset.Charset;
import java.util.Arrays;

/**
 * Преобразует строку в массив типа byte[], используя кодировку по умолчанию (или можно указать).
 */
public class GetBytes_array {
    public static void main(String[] args) {
        String s = "тест";
        byte[] arr = s.getBytes();
        System.out.println(Arrays.toString(arr));
        System.out.println(Charset.defaultCharset()); // UTF-8 стандратная кодировка
        arr = s.getBytes(Charset.forName("cp1251")); // измнение кодировки на windows-1251
        System.out.println(Arrays.toString(arr));
    }

}
/*
[-47, -126, -48, -75, -47, -127, -47, -126]
UTF-8
[-14, -27, -15, -14]
 */