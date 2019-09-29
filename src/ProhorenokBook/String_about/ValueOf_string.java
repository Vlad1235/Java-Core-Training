package ProhorenokBook.String_about;
/**
Создание экземпляра класса String через метод valueOf().
Преобразование массива символов с строку.
*/
public class ValueOf_string {
    public static void main(String[] args) {
        String s1 = String.valueOf(10);
      System.out.println(s1);
        String s2 = String.valueOf(15.35);
        System.out.println(s2);
        char[] charArr = new char[] {'с','т','р','о','к','а'};
        String s3 = String.valueOf(charArr);
        System.out.println(s3);
        System.out.println(s3.length());
        char[] charArr2 = {'с','т','р','о','к','а'};
        String s = String.valueOf(charArr2,0,3); // только выбранную часть.
        System.out.println(s);

    }
}
/*
10
15.35
строка
6
стр
*/