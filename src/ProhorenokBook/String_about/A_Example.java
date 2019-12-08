package ProhorenokBook.String_about;

/**
 * Пример, что в объектах класса String все строки неизменяемы. Поэтому практически все строковые методы возвращают НОВЫУЮ строку!!
 * Ценой использования + конкатенации станет новая строка. Это переполнение памяти
 */
public class A_Example {
    public static void main(String[] args) {
            String s = "строка";
            s+="строка2";
        System.out.println(s);
    }
}
