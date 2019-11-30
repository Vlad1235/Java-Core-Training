package Alishev.middleleveljava.thread.keywordsync.syncmore.sycnspeedup;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * Мы хотим распаралелить выполнение программы на 2 ядра. И за тоже время сделать в 2 раза больше, НО НЕ ПОТЕРЯТЬ ПО ВРЕМЕНИ!
 *
 * good practice если хотим синхронизваться на каком то ообъекте, то создавать отдельный объект и называть его lock. Хотя можно и синхронизоваться на объекте List
 *
 * Теперь поток два может работать с методом void addToList2() пока поток один работает с методом addToList1().
 * НО попрежнему наример поток два не может работать с методом пока с ним работает поток один!
 */
public class Test2 {
    public static void main(String[] args) {
        new Worker().main();
    }
}

class Worker {

    Random random = new Random();

    Object lock1 = new Object(); // этот объект используется лишь для синхронизации
    Object lock2 = new Object(); // этот объект используется лишь для синхронизации

    private List<Integer> list = new ArrayList<>();
    private List<Integer> list2 = new ArrayList<>();

    public void addToList1() {
        synchronized (lock1) { // происходит синхронизация на разных объектах. Разный монитор
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list.add(random.nextInt(100));
        }
    }

    public  void addToList2() {
        synchronized (lock2) { // происходит синхронизация на разных объектах. Разный монитор
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list2.add(random.nextInt(100));
        }
    }

    public void work() {
        for (int i = 0; i < 1000; i++) {
            addToList1();
            addToList2();
        }
    }

    public void main() {
        long before = System.currentTimeMillis();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                work();
            }
        });

        Thread thread2 = new Thread(()->{
            work();
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long after = System.currentTimeMillis();
        System.out.printf("Program took %d millseconds to run", after - before);
        System.out.println();
        System.out.println("List1: " + list.size());
        System.out.println("List2: " + list2.size());
    }
}
/*
Program took 3587 millseconds to run
List1: 1970 мы не синхронизировали потоки должно было быть 2000. Потери от running condition. метод add() тоже не атомарный метод.
List2: 1972


Program took 7035 millseconds to run НО ПРОГРАММА СТАЛА В более чем 2 раза дольше!!!
List1: 2000 синхронизированные потоки
List2: 2000

Program took 3444 millseconds to run
List1: 2000
List2: 2000

ПРОБЛЕМА С INTRINSIC LOCK РЕШЕНА!
ПОТЕРЬ ОТ RUNNING CONDITION НЕТ!
ЗА СХОЖЕЕ ВРЕМЯ ЗА СЧЕТ ИСПОЛЬЗОВАНИЯ 2 ЯДЕР(исп sleep()) МЫ ДОСТИГЛИ ТОЙ ЖЕ СКОРОСТИ И В 2 РАЗА БОЛЬШЕ ВЫЧЕСЛЕНИЙ ПРОВЕЛИ
 */
