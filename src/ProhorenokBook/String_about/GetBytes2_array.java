package ProhorenokBook.String_about;

import java.util.Arrays;

/**
 * Важность проверки кодировки. Данные получаемые из вне(например введеные пользователем) могут быть в различных кодировках.
 * Надо привести все к одной, и проверять на исключения.
 */
public class GetBytes2_array {
    public static void main(String[] args) {
    String s = "тестирование";
    byte[] arr = new byte[0];
    try {
        arr = s.getBytes("cp1251");

    } catch (Exception e){
        e.printStackTrace();
        System.exit(1);
    }
        System.out.println(Arrays.toString(arr));
    }
}
/*
[-14, -27, -15, -14, -24, -16, -18, -30, -32, -19, -24, -27]
 */