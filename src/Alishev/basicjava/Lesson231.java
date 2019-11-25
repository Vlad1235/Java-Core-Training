package Alishev.basicjava;

/**
 * Урок 23(продолжение): Форматирование строк в Java
 */
public class Lesson231 {
    public static void main(String[] args) {
        String name = "Jack";
        String description = "an idiot";
        int score = 10;
        System.out.printf("%s, you are %s and your score is %d\n", name, description, score);

        System.out.printf("Number is %.2f\n", 3.14159265358979323846); // метод еще и округляет до следующего по знаку
        System.out.printf("Number is %.2f\n", Math.PI);
    }
}
/*
Jack, you are an idiot and your score is 10
Number is 3.14
Number is 3.14
 */