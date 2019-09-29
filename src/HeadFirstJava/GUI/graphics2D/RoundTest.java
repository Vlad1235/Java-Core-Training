package HeadFirstJava.GUI.graphics2D;

import javax.swing.*;

public class RoundTest {

    public static void main(String[] args){
        JFrame frame = new JFrame();
        Round panel = new Round();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.getContentPane().add(panel);
        frame.setSize(500, 500);
        frame.setVisible(true);

    }
}
