package Nasledovanie.example1;

/**
 * Применение наследования для расширения функционала НАСЛЕДУЕМОГО класса
 */
public class Box {
    double width;
    double height;
    double depth;

    /**
     * Конструирование клона объекта!!!!! НИКОГДА НЕ ПРОБОВАЛ
     */
    Box(Box ob){
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

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
