package ProhorenokBook;

/**
 * Перечисление - совокупность констант, описывающих все допустимые значения. Если
 * переменной присвоить значение вне списка, то компилятор выдасть ошибку.
 */
public class ENUM_usage {
    public static void main(String[] args) {
        Color color1, color2;
        color1 = Color.BLACK;
        color2 = Color.RED;
        if(color1 == Color.BLACK){
            System.out.println("color1 ==BLACK");
        }
        if(color1 != color2){
            System.out.println("color1 != color2");
        }
        System.out.println(color1);
    }
}
enum Color{ RED, BLUE, GREEN, BLACK} //объявление перечисления.


/*
color1 ==BLACK
color1 != color2
BLACK
 */
