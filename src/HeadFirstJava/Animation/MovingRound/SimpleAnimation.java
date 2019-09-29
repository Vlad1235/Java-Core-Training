package HeadFirstJava.Animation.MovingRound;

import javax.swing.*;
import java.awt.*;

public class SimpleAnimation {
    int x = 0; // поля для координат
    int y = 0; // поля для координат

    public static void main(String[] args) {
        SimpleAnimation gui = new SimpleAnimation();
        gui.go();
    }

    public void go(){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MyDraw drawStick = new MyDraw();

        frame.getContentPane().add(BorderLayout.CENTER,drawStick);
        frame.setSize(300,300);
        frame.setVisible(true);

        for(int i =0;i<130; i++){ // повторяем это 130 раз
            x++;
            y++;
            drawStick.repaint(); // перересовывание тут
            try{
                Thread.sleep(50); // Для замедления процесса, иначе  не увидим движения из-за скорости.
            } catch (Exception ex){}
        }
    }

    class MyDraw extends JPanel {
        public void paintComponent(Graphics g){
            g.setColor(Color.white);
            g.fillRect(0,0,getWidth(),getHeight()); // закрашиваем те пиксели, где прошли
            g.setColor(Color.blue);
            g.fillOval(x,y,40,40); // то что движется
        }
    }
}
