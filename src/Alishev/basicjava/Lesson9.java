package Alishev.basicjava;

/**
 * Java для начинающих. Урок 9: Операторы break и continue
 */
public class Lesson9 {
    public static void main(String[] args) {
        for (int i = 0; i <= 15; i++) {
            if (i % 2 == 0) { // поделить на это число после знака процента и посмотри на остаток. У любого четного числа остаток от деления на 2 равен 0
                continue;
            }
        }
    }
}
