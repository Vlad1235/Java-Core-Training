package Nasledovanie.example1;

/**
 * Класс BoxWe ight наследует все характеристики класса Вох и добавляет к ним компонент
 * weight . Классу BoxWeight не нужно воссоздавать все характеристики класса
 * Вох. Для этого достаточно расширить класс Вох, исходя из конкретных целей
 */
public class BoxWeight extends Box {
    double weight;

    BoxWeight(double w, double h, double d, double m){
      super( w,  h,  d);
      weight = m;
    }



}
