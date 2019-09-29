package HeadFirstJava.Exceptions;

public class TestExceptions {
    public static void main(String[] args) {
        String test = "yes";

        try {
            System.out.println("Начало try");
            doRisky(test);
            System.out.println("Конец try");
        } catch (Exception se) {
            System.out.println("Жуткое исключение");
            System.exit(1);
        } finally {
            System.out.println("finally");
        }
        System.out.println("Конец main");
    }

    static void doRisky(String test) throws Exception {
        System.out.println("Начало опасного метода");
        if ("yes".equals(test)) {
            throw new Exception();//перебрасывает безвозвратно
        }
        System.out.println("Конец опасного метода");
        return;
    }
}
/* // если test = "Нет";
Начало try
Начало опасного метода
Конец опасного метода
Конец try
finally
конец main

// если test = "Да";
Начало try
Начало опасного метода
Жуткое исключение
finally
конец main

 */