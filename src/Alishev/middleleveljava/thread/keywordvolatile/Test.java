package Alishev.middleleveljava.thread.keywordvolatile;

import java.util.Scanner;

/**
 * В случае когда один поток ЗАПИСЫВАЕТ В ПЕРЕМЕННУЮ, а другой ПОТОК ЧИТАЕТ ИЗ ПЕРЕМЕННОЙ может возникнуть проблема когурентности кэшей.
 *
 * Когурентность кэша процессора это когда мы в коде присвоили значение переменной  false чтобы остановить процесс, а он не остановиться
 * так как если многоядерный процессор, и кэш у каждого ядра свой и один из них не забрал новое измененнное значнеие первым ядром значение у оперативной памяти
 *
 *
 *
 * Проблема когурнтности кэшей процессора решается обозначением переменной volatile. Она гарантирует синхронизацию кэшей  так как не будет записываться в кеш пямять процессоров а ТОЛЬКО ХРАНИТЬСЯ В ОПЕРАТИВНОЙ ПАМЯТИ и от туда забираться ядрами
 *
 */
public class Test {
    public static void main(String[] args) { // первый пишущий (через класс Scanner)
        myThread myThread = new myThread();
        myThread.start(); // второй считывающий

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine(); // это когда мы введем сообщение в консоли. Она подсться когда мы нажмем на клавишу Enter.Затем Java перейдет к следующей строке кода
        myThread.shutdown();
    }
}

class myThread extends Thread {
    private volatile boolean running = true; // помечаем переменную чтобы она храниласт в ОЗУ

    public void run() {
        while (running) {
            System.out.println("Hello");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void shutdown() {
        this.running = false;
    }
}