package Alishev.basicjava.exceptions;

/**
 * Не найдя подходящего для нас класса исключения из списка стандартных, мы можем создать собственное исключение.
 */
public class ScannerException extends Exception {
    public ScannerException(String description){
        super(description); // передаем описание классу родителю, чтоб он это вывел в консоль
    }
}
