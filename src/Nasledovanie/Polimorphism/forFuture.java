package Nasledovanie.Polimorphism;
/**
 Передаем объект Shape методу, который абсолютно не имеет понятия, какую фигуру предстоит нарисовать.
 Данный метод позволяет рисование любой допустимой фигуры - даже такой, которую в будущем можно добавить как новый класс.
 static void drawMe(Shape s) {
 s.draw();
 }
 */
public class forFuture {
    static void drawMe(Shape s) {
        s.draw();
        s.scream();
    }
}
