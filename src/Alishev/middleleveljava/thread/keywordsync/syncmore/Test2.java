package Alishev.middleleveljava.thread.keywordsync.syncmore;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Если нам нужно синхронизовываться на разных объектах для ускорения
 *
 * Мы хотим распаралелить выполнение программы на 2 ядра. И за тоже время сделать в 2 раза больше
 */
public class Test2 {
    public static void main(String[] args) {
        new Worker().main();
    }
}

class Worker {

    Random random = new Random();

    private List<Integer> list = new ArrayList<>();
    private List<Integer> list2 = new ArrayList<>();

    public synchronized void addToList1() { // тут проблема
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        list.add(random.nextInt(100));
    }

    public synchronized void addToList2() { // тут проблема
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        list2.add(random.nextInt(100));
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

!!!! Проблема в том что неважно что два метода разные через Intrinsic lock текущий объект блокируется  полностью для второго потока, даже если второй поток обращается к методу, к которым первый поток не работает.
Это из за того что обращение идет через this то есть к текущему потоку ВЦЕЛОМ!

Решение это создать просто объекты чтобы использовать их для синхронизации. Или использовать какие-то объекты, которые уже есть в коде, но это bad practice
 */
