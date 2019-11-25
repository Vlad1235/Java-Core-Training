package Alishev.basicjava.exceptions;

import java.io.IOException;
import java.text.ParseException;

/**
 * Несколько разных исключений.
 * Располагать catch блоки от самого низкого в иерархии к самому высокому. Иначе высокий блок автоматически обработает все низкие иключения не так как мы указали
 */
public class Exceptions3 {
    public static void main(String[] args) {

        try {
            run();
        } catch (ParseException e) {
            System.out.println("Обработать так-то так-то");
        } catch (IOException e) {
            System.out.println(" Обработать так-то так-то");
        } catch (Exception e){
            System.out.println("Общая проблема");
        }
    }

    public static void run() throws IOException, ParseException, IllegalArgumentException{

    }
}
