package Nasledovanie.exampleSuperUsage2;

/**
 * Приведенный выше пример демонстрирует следующий важный аспект: метод super ( ) всегда ссьтается на конструктор ближайшего п о иерархии суперкласса. В мето­
 * де suреr( ) из клacca Shipment вызывается конструктор класса ВохWеight. А в методе
 * super( ) из класса BoxWeight вызывается конструктор класса Вох. Если в иерархии
 * классов требуется передать параметры конструктору суперкласса, то все подклассы
 * должны передавать эти параметры вверх по иерархии
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
