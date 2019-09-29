package HeadFirstJava.GUI.graphics2D;

import javax.swing.*;
import java.awt.*;


public class Round extends JPanel {

    public void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D) g; // Если нужно использовать метод из класса Graphics2, то нельзя зайдествовать параметр g напрямую. Нужно обозначить новой переменной и определить новый тип.

        int red = (int)(Math.random()*255);
        int green = (int)(Math.random()*255);
        int blue = (int)(Math.random()*255);
        Color startColor = new Color(red,green,blue);

        red = (int)(Math.random()*255);
        green = (int)(Math.random()*255);
        blue = (int)(Math.random()*255);
        Color endCoolor = new Color(red,green,blue);

        GradientPaint gradient = new GradientPaint(70,70,startColor,150,150,endCoolor);
        g2d.setPaint(gradient);
        g2d.fillOval(70,70,100,100); // начальная точка по x=70 y 70й пиксели, ширина и высота по 100.
    }
}
