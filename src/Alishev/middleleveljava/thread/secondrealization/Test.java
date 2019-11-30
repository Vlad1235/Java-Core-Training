package Alishev.middleleveljava.thread.secondrealization;

/**
 * Java программа только тогда заканчивается когда будут завершены ВСЕ ЕЕ ПОТОКИ!
 */
public class Test {
    public static void main(String[] args) {
            Thread thread = new Thread(new Runner());
            thread.start();
        System.out.println("Hello from MainThread"); // ВАЖНО! поток main завершил свою жизнь после того как вывел на консоль это(ПРОСТО КОДА БОЛЬШЕ НЕТ), и И ТЕПЕРЬ ТОЛЬКО ПОТОК thread РАБОТАЕТ ДО ЗАВЕРШЕНИЯ НАПИСАННОЙ В НЕМ ЛОГИКИ
    }
}

class Runner implements Runnable{
    @Override
    public void run() {
        for (int i=0;i<100;i++){
            System.out.println("Hello from myThread"+i);
        }
    }

}