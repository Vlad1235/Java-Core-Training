package HeadFirstJava.Multithread.ControlledviaSleep;

public class ThreadTester {
    public static void main(String[] args) {
        for (int index=0;index<10;index++) {
            Runnable threadJob = new MyRunnable();
            Thread myThread = new Thread(threadJob);
            myThread.start();
            System.out.println("Возвращемся в метод main");
        }
    }
}
/*
Возвращемся в метод main
Возвращемся в метод main
Возвращемся в метод main
Возвращемся в метод main
Возвращемся в метод main
Возвращемся в метод main
Возвращемся в метод main
Возвращемся в метод main
Возвращемся в метод main
Возвращемся в метод main
Вершина стека
Вершина стека
Вершина стека
Вершина стека
Вершина стека
Вершина стека
Вершина стека
Вершина стека
Вершина стека
Вершина стека
 */