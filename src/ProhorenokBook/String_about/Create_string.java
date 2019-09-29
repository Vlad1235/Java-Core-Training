package ProhorenokBook.String_about;

/**
 * Интересные факты о создание строк. Создание экземпляра класса String.
 */
public class Create_string {
    public static void main(String[] args) {
        char ch1,ch2;
        ch1 = 114; // КОД СИМВОЛА в UTF-16.
        ch2 = 'r';
        System.out.println(ch1 + " " + ch2);

        char ch = 'n';
        System.out.println((int)ch); // Получить код символа, этот способ. 110

        String s = "";
        String s1 = new String(); // Создали пустую строку, то есть ноль символов в ней.
        System.out.println(s1.length()); // 0
        char[] charArr = new char[] {'с','т','р','о','к','а'};
        String s2 = new String(charArr); // через конструктор класса String создали массив типа char[]
        System.out.println(s2); //строка
        System.out.println(s2.length()); // 6
        byte[] arr2 = {115,116,114,105,110,103}; // через конструктор класса String создали массив типа byte[]
        String s3 = new String(arr2);
        System.out.println(s3); //string
        System.out.println("строка".length()); //!!!!!! все является экземпляром класса!
        /*
        Метод charAt(index) вытащить нужный символ из строки.
         */
        System.out.println("строка".charAt(4)); // к
    }
}
/*
r r
110
0
строка
6
string
6
к
 */