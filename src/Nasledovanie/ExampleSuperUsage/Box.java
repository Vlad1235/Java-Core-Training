package Nasledovanie.ExampleSuperUsage;

/**
 * Применение в конструктре SUPER()
 */
public class Box {
    double width;
    double height;
    double depth;


    /**
     * Конструктор когда принимаются все аргументы.
     */
    Box(double x, double y, double z){
        width = x;
        height = y;
        depth = z;
    }
    /**
     * Конструктор когда не указаны размеры. Конструктор по умолчанию.
     */
    Box(){
        width = -1;
        height = -1;
        depth = -1;
    }
    /**
     * Конструктор применяемый при создании куба.
     */
    Box(double len){
        width = height = depth = len;
    }

    double volume(){
        return width*height*depth;
    }
}
