package Alishev.middleleveljava.thread.keywordsync;

/**
 * решение проблемы
 * Синхронизация потоков при записи переменной
 * ключевое слово syncronized можно писать ТОЛЬКО В МЕТОДАХ
 * Теперь всегда потоки по очереди! обращаются к переменной
 *
 * Только один поток в один момент времени получет доступ к телу метода. Все что находится внутри может выполнять только один поток в один момент времени.
 * Другой поток просто ждет
 *
 * Как работает synchronized - в языке программирования Java при создании любого объекта ему присваивается МОНИТОР ( Intrinsic Lock). Этот монитор в один момент времени может принадлежать лишь одному потоку. И слово synchronized использует эту особенность тллько один поток может завладеть монитором объекта
 Важно запомнить что синхронизация происходит на объекте. ДЛЯ СИНХРОНИЗАЦИИ НУЖЕН ОБЪЕКТ

 ЕСЛИ МЫ СИНХРОНИЗИРУЕМСЯ НЕЯВНО public synchronized void increment() - через метод, то мы значит СИНХРОНИЗИРУЕМСЯ НА МОНИТОРЕ ОБЪЕКТА THIS!!

 */
public class Test3 {
    private int counter;

    public static void main(String[] args) throws InterruptedException {
        Test3 test = new Test3();
        test.doWork();
    }

    public synchronized void increment(){
        //this - он тут этот объект
        counter++;
    }

    public void doWork() throws InterruptedException {
        Thread one = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                increment();
            }
        });

        Thread two = new Thread(() -> { // через лямбда
            for (int i = 0; i < 10000; i++)
                increment();
        });

        one.start();
        two.start();

        one.join();
        two.join();

        System.out.println(counter); // теперь всегда правельный ответ. Потоки по очереди обращаются к переменной
    }
}
/*
20000
 */