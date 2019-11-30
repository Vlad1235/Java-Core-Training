package Alishev.middleleveljava.thread.keywordsync;

/**
 *  МНОГО ПОТОКОВ ПИШУТ В ОДНУ ПЕРЕМЕННУЮ
 */
public class Test {
    private int counter;

    public static void main(String[] args) throws InterruptedException {
        Test test = new Test();
        test.doWork();
    }

    public void doWork() throws InterruptedException {
        Thread one = new Thread(new Runnable() { // через анонимный класс
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    counter++;
                }
            }
        });

        Thread two = new Thread(() -> { // через лямбда
            for (int i = 0; i < 10000; i++)
                counter++;
        });

        one.start();
        two.start();

        // если сразу перейдем к System.out.println(counter) то выведется лишь одно значение, так как поток main сразу выведет значение, то есть не дает даже инкрементировать до конца.
        // Мы не ждем пока потоки завершатся - плохо

        // чтобы подождать в нашем потоке main других потоков только и потом выводить System.out.println(counter)
        one.join(); // ждем пока one поток не завершит работу. И поток main тут останавливается и ждет!
        two.join(); // ждем пока пока закончит работу поток two. И поток main тут останавливается и ждет!

        System.out.println(counter);
    }
}
// 15040 или 12388 или 14930 результат каждый раз разный и всего лишь одно значение.
// Это из-за того что два значения пишут в ОДНУ переменную тем самым старое значение теряется. Это такое понятие как Race Condition