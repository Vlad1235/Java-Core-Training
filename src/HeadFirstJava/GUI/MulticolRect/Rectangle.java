package HeadFirstJava.GUI.MulticolRect;

import javax.swing.*;
import java.awt.*;

public class Rectangle extends JPanel {
    public void paintComponent(Graphics g) {
        //g.fillRect(0,0,this.getWidth(),this.getHeight()); И без этой строчки правельно работает.

        int red = (int)(Math.random()*255);
        int green = (int)(Math.random()*255);
        int blue = (int)(Math.random()*255);

        Color randomColor = new Color(red,green,blue); // Будет при кадом запуске разноцветный круг
        g.setColor(randomColor);
        g.fillOval(70,70,100,100);
    }
}
