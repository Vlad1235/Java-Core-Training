package ProhorenokBook.String_about;

/**
 * Преобразует массив строк в 1 строку. Элементы добавляются через выбранный разделитель.
 */
public class join_array {
    public static void main(String[] args) {
        String[] arr = {"word1","word2","word3","word4"};
        System.out.println(String.join("-",arr));
        System.out.println(String.join(":","word1","word3","word5"));

    }
}
/*
word1-word2-word3-word4
word1:word3:word5
 */