package Nasledovanie.example1;

/**
 * следующий класс наследует характеристики класса Вох и добавляет
 * к ним свойство цвета параллелепипеда
 */
public class ColorBox extends Box {
    int color;

    ColorBox(double x, double y, double z, int c){
        super(x,y,z);
        color = c;
    }
}
