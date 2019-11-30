package Alishev.middleleveljava.thread.keywordsync.syncmore;

public class Test {
    private int counter;

    public static void main(String[] args) throws InterruptedException {
        Test test = new Test();
        test.doWork();
    }

    public void increment(){
        synchronized (this) { // synchronized block. То есть мы прямо указываем что внутри блока код потоки синхронизированы. В одни момент времени исполняться только одним потоком
            counter++;
    }
        /*
        Это полный эквивалент кода ниже
    public synchronized void increment(){
        counter++;
    }
        то есть мы синхронизируемся на объекте this в скобках указываем на каком объекте синхронизироваться

    Однако в самом метод может и другие методы внутри себя содержать, которые не нужно синхронизировать
         */
   //     System.out.println("asdf"); например этот метод могут вызывать много потоков одновременно
    }

    public void doWork() throws InterruptedException {
        Thread one = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                increment();
            }
        });

        Thread two = new Thread(() -> {
            for (int i = 0; i < 10000; i++)
                increment();
        });

        one.start();
        two.start();

        one.join();
        two.join();

        System.out.println(counter);
    }
}
