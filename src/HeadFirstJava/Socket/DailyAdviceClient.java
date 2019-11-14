package HeadFirstJava.Socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class DailyAdviceClient {
    public void go() {
        try {
            Socket s = new Socket("127.0.0.1", 4242); //создаем соединение через сокет К ПРИЛОЖЕНИЮ, работающему на данном порту
            InputStreamReader streamReader = new InputStreamReader(s.getInputStream()); // запросить у сокета входящий поток getInputStream()
            BufferedReader reader = new BufferedReader(streamReader);

            String advice = reader.readLine();
            System.out.println("Today you should: " + advice);
            reader.close();
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        DailyAdviceClient client = new DailyAdviceClient();
        client.go();
    }
}
