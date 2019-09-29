package Input;

import java.util.Scanner;

/**
 * получить ввод из консоли
 */
public class ConsoleInput implements Input {
    private Scanner scanner = new Scanner(System.in); // конструктор внутри себя принимает поток ввода данных
        public String ask(String question){
            System.out.println(question); //  печатаем вопрос, которых хотим спросить у пользователя
            return scanner.nextLine(); // метод вернет нам ответ, ктр пользователь напишет на заданный ему вопрос. И этот ответ и будет возвращать метод.
        }
}
