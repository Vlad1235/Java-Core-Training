package HeadFirstJava.GUI.SimpleGui1B;

/*
Усложняем базовую архитектуру. Добавляем возможность нажимать кнопку и добавлять действия при нажатии.
 */

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class SimpleGui1B implements ActionListener { //Реализуем интерфейс.Когда говорим: Экземпляр SimpleGui1B реализует интерфейс ActionListener.Кнопка будет передавать события только тем, кто реализует ActionListener.
    JButton button;

    public static void main(String[] args) {
        SimpleGui1B gui = new SimpleGui1B();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame();

        button = new JButton("click me");
        button.addActionListener(this); // Код говорит кнопке: Добавь меня к своему списку слушателей. Агрумент должен быть объектом класса, реализуемого ActionListener

        frame.getContentPane().add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent event) { // Реализация метода из интерфейса ActionListener.Это фактический метод обработки событий.
        button.setText("I have been clicked"); // Кнопка вызывает этот метод, чтобы известить о наступлении события.Она отправляет объект ActionEvent как аргумент, но он нам не нужен. Достаточно знать, что событие произошло.
    }
}



