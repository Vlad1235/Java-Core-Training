package HeadFirstJava.GUI.InnerClassTwoInTwo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TwoButtons {
    JFrame frame;
    JLabel label;

    public static void main(String[] args) {
        TwoButtons gui = new TwoButtons();
        gui.go();
    }

    public void go() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton labelButton = new JButton("Change label");
        labelButton.addActionListener(new LabelListener()); // вместо this методу регистрации слушателя кнопки, мы передааем ему экземпляр соотвествующего класса слушателя

        JButton colorButton = new JButton("Change Circle");
        colorButton.addActionListener(new ColorListener()); // вместо this методу регистрации слушателя кнопки, мы передааем ему экземпляр соотвествующего класса слушателя

        label = new JLabel(" I am a label");
        MyRound drawPanel = new MyRound();

        frame.getContentPane().add(BorderLayout.SOUTH, colorButton);
        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
        frame.getContentPane().add(BorderLayout.EAST, labelButton);
        frame.getContentPane().add(BorderLayout.WEST, label);

        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    class LabelListener implements ActionListener { // Внутренний класс может использовать перменные внешнего
        public void actionPerformed(ActionEvent event) {
            label.setText("Ouch!");
        }
    } // закрываем внутренний класс

    class ColorListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            frame.repaint();
        }
    } // закрываем внешний класс
}


