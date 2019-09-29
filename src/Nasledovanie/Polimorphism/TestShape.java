package Nasledovanie.Polimorphism;

public class TestShape {
    public static void main(String[] args){
        forFuture v = new forFuture();
        Circle circle = new Circle();
        Rectangle rect = new Rectangle();
        Star star = new Star();
        Oval oval = new Oval();
/**
 * За раз можем вызвать дофига методов, так как мы их все прописали в классе forFuture.
 */
        v.drawMe(circle);
        v.drawMe(rect);
        v.drawMe(star);
        v.drawMe(oval);
    }
}

/*
Я рисую круг
aaaaaa
Я рисую прямоугольник
eeeeeee
Я рисую звезду
yiiiiiii
Я рисую овал
oooooo
*/
