package Input;

/**
 * пример повторяшка)) что введем, то и выведется на консоль
 */
public class StartUI {
    public static void main(String[] args) {
        ConsoleInput output = new ConsoleInput();
        String name = output.ask("Введите вопрос:");
        System.out.println("Каков вопрос, таков ответ: " + name);
    }
}
/*е
если использвать метод next() то он выведет лишь первую строчку. Нужно использовать метод nextLine()
    Введите вопрос:
        привет как дела
        Каков вопрос, таков ответ: привет
 */
/*
метод nextLine()
Введите вопрос:
привет козел
Каков вопрос, таков ответ: привет козел
 */