package HeadFirstJava.Socket.SimpleChatClient;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * Данная версия умеет оптравлять сообщения на сервер, но не принимать
 */
public class SimpleChatClientA {
    JTextField outgoing;
    PrintWriter writer;
    Socket sock;

    /*
     *Создаем графику и подключаем слушатель
     *
     */
    public void go() {
        JFrame frame = new JFrame("Ludicrously Simple Chat Client");
        JPanel mainPanel = new JPanel();
        outgoing = new JTextField(20);
        JButton sendButton = new JButton("Send");
        sendButton.addActionListener(new SendButtonListener());
        mainPanel.add(outgoing);
        mainPanel.add(sendButton);
        frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
        setUpNetworking();
        frame.setSize(400, 400);
        frame.setVisible(true);

    }
    /*
    Создаем сокет и PrintWriter
     */
    private void setUpNetworking() {
        try {
            sock = new Socket("127.0.0.1", 5000);
            writer = new PrintWriter(sock.getOutputStream());
            System.out.println("networking established");
        }
        catch(IOException ex) {
            ex.printStackTrace();
        }
    }
    /*
    Получаем текст и текстового поля и отправляем его на сервер
     */
    public class SendButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent ev) {
            try {
                writer.println(outgoing.getText()); // при каждом вызове println данные передаются по сети на сервер
                writer.flush();
            }
            catch (Exception ex) {
                ex.printStackTrace();
            }
            outgoing.setText("");
            outgoing.requestFocus();
        }
    }

    public static void main(String[] args) {
        new SimpleChatClientA().go();
    }
}
