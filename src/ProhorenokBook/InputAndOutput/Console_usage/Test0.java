package ProhorenokBook.InputAndOutput.Console_usage;

import java.io.Console;

/**
 * Класс Console позволяет взимодействовать с окном консоли: читать и выводить данные.
 * Создать объект позволяет метод console() из класса System
 */
public class Test0 {
    public static void main(String[] args) {
        /*
        Если приложение не связано с консолью, то метод вернет значение null
         */
        Console cons = System.console();
        if(cons !=null){
            cons.printf("%s","Текст, выводимый на консоль");
        } else {
            System.out.println("Консоль не подключена");
        }
    }
}
/*
Консоль не подключена
 */