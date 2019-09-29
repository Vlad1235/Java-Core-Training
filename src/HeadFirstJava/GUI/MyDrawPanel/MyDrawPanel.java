package HeadFirstJava.GUI.MyDrawPanel;

import javax.swing.*;
import java.awt.*;

public class MyDrawPanel extends JPanel { // чтобы добавить пользовательский виджет надо его наследовать из класса JPanel.
        public void paintComponent(Graphics g) { // метод Graphics, его вызывает система
            g.setColor(Color.blue); // одноцветный будет полностью
            g.fillOval(150,150,100,100); // будет круг
        }
}
