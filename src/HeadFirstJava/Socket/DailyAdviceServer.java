package HeadFirstJava.Socket;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class DailyAdviceServer {
    String[] adviceList = {"Take smaller bites", "Go for the tight jeans. No they do NOT make you look fat",
            "One word: inappropriate", "Just for today, be honest.  Tell your boss what you *really* think",
            "You might want to rethink that haircut"};

    public void go() {
        try {
            ServerSocket serverSock = new ServerSocket(4242); //приложение отслеживает клиентские запросы на порт 4242 на том же компе, где выполняется данный код.
            while (true) { // сервер входит в постоянный цикл, ожидая клиентских подключений
                Socket sock = serverSock.accept();// метод accept() блокирует приложение до тех пор, пока не поступит запрос, после чего возвращает сокет(но уже на другом порту) для начала работы с клиентом.
                PrintWriter writer = new PrintWriter(sock.getOutputStream()); // после соединения объекта socket с клиентом мы это используем для создания экземпляра класса  PrintWriter и отправляем с его помощью строку с советом.
                String advice = getAdvice();
                writer.println(advice);
                writer.close(); // закрываем сокет как работа с клиентом закончена.
                System.out.println(advice);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private String getAdvice() {
        int random = (int) (Math.random() * adviceList.length);
        return adviceList[random];
    }

    public static void main(String[] args) {
        DailyAdviceServer server = new DailyAdviceServer();
        server.go();
    }
}
