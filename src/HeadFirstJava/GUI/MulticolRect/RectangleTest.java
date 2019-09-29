package HeadFirstJava.GUI.MulticolRect;

import javax.swing.*;

public class RectangleTest {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        Rectangle panel = new Rectangle();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Эта строка завершает работу программы при закрытии окна( если не добавить данную строчку, то приложение будет "висеть" на экране вечно.

        frame.getContentPane().add(panel);
        frame.setSize(500, 500);
        frame.setVisible(true);
    }
}
