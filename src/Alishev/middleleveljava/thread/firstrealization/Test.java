package Alishev.middleleveljava.thread.firstrealization;

public class Test {
    public static void main(String[] args) { // потоки конкурируют между собой за вывод на консоль. Случайным образом передается им процессорное время
        myThread myThread = new myThread();
        myThread.start(); // чтобы создать второй поток нужно вызывать данный метод. (первый поток это метод main() )

        myThread myThread2 = new myThread();
        myThread2.start(); // третий поток

    }
}

class myThread extends Thread { // когда унаслоедовали от класса thread то это стал потоком
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("Hello from myThread" + i);
        }
    }
}
/*
Hello from myThread0
Hello from myThread1
Hello from myThread0
Hello from myThread2
Hello from myThread1
Hello from myThread3
Hello from myThread2
Hello from myThread4
Hello from myThread3
Hello from myThread5
Hello from myThread4
Hello from myThread6
Hello from myThread5
Hello from myThread7
Hello from myThread6
Hello from myThread8
Hello from myThread9
Hello from myThread7
Hello from myThread10
Hello from myThread8
Hello from myThread11
Hello from myThread9
Hello from myThread12
Hello from myThread13
Hello from myThread14
Hello from myThread15
....................
 */