package HeadFirstJava.GUI.SimpleGui1;

/*
Создать поле для работы и просто кнопку click me. В этом поле будем потом уже работать и добавлять виджеты.
Это базовая архитектура(если убрать кнопку).
 */

import javax.swing.*;

public class SimpleGui1 {

    public static void main(String[] args) {

        JFrame frame = new JFrame(); // Создаем фрейм, чтобы уже через него работать со всеми видами графики.
        JButton button = new JButton("click me"); // добавляем кнопку.

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Эта строка завершает работу программы при закрытии окна( если не добавить данную строчку, то приложение будет "висеть" на экране вечно.

        frame.getContentPane().add(button); // Добавляем кнопку на панель фрейма.
        frame.setSize(500,500); // присваиваем фрейму размер (в пикселях).
        frame.setVisible(true); // делаем фрейм видимым( если не прописать данную сроку, то выполнив код, ничего не увидим).
    }
}