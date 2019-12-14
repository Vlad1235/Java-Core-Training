package ProhorenokBook.regularexpressions;

/**
 Существует еще один более простой способ проверки полного соотвествия шаблону, не требующий использования классов Pattern, Matcher.
 Класс String имеет метод boolean matches(), который позволяет указать шаблон в виде строки. Если строка полностью соотвествует шаблону
 то возвращает true
 */
public class StringClass_usage {
    public static void main(String[] args) {
        if ("12d".matches("[0-9][a-z]+")){
            System.out.println("Соответствует");
        } else {
            System.out.println("Не соотвествует");
        }
    }
}
