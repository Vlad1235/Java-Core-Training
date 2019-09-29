package HeadFirstJava.GUI.MyDrawPanel;

import javax.swing.*;

public class MyDrawPanelTest {

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        MyDrawPanel panel = new MyDrawPanel(); // подготовим объект, чтобы сделать виджет на "доске". Обязательный пункт.

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Эта строка завершает работу программы при закрытии окна( если не добавить данную строчку, то приложение будет "висеть" на экране вечно.

        frame.getContentPane().add(panel);
        frame.setSize(500, 500);
        frame.setVisible(true);
    }
}