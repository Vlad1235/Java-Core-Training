package ProhorenokBook.InputAndOutput.PrintWriter_PrintStream.PrintStream_usage;

/**
 * Объекты System.out(стандартный поток вывода) и System.err(поток вывода сообщений об ошибке) являются экзеплярами класса PrintStream.
 * Поэтому можно использовать все методы из этого класса.
 * По умолчанию System.out и System.err связаны с окном консоли.
 */
public class Test2 {
    public static void main(String[] args) {
        System.out.print("строка");
        System.out.printf("%d", 10).println();
        System.out.format("%d", 10).println();
        System.out.append('c').append(" строка").println();
        try {
            System.out.write("String\n".getBytes());
        } catch (Exception ex) {
            System.out.println("Исключение");
        }
    }
}
/*
строка10
10
c строка
String
 */