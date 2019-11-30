package Alishev.middleleveljava.thread.keywordsync;

/**
 * Исправление проблемы Race Condition
 */
public class Test2 {
    private int counter;
    /*
     атомарность это когда операция занимает один такт времени
       Хотя пишем counter++, это лишь упрощение, процессор это обрабатывает как counter=counter+1
       counter=counter+1; данная операция не атомарна тут сначала считыванее старой потом увеличение на 1 и потом новое значение присвоить переменной. Тут 3 операции!
         это и есть проблема.
         Пример:
    1:100( когда был активен в кэш counter=!counter ТУТ!+1 к себе положил 100)активен и инкрементировал и стало 101, врубился второй поток этот засыпает
    2:100(в кэш  изначально тоже себе положил 100 НО! еще 2 операции: +1 и = не успел сделать и заснул) инкр и стало тоже 101, даже не смотрел,что первый уже ей присвоил 101

    Или еще вариант, когда первый поток долго не отдает инициативу и после 101 присвает еще и 102 и 103 и 104 но потом таки теряет и засыпает
        у второго потока в кэш попрежнему 100 и он перепишет 104 на 101!!!

        ИТОГО запомнить: операция инкрементации НЕ АТОМАРНА, она состоит из 3 частей!!

     */
    public static void main(String[] args) throws InterruptedException {
        Test2 test = new Test2();
        test.doWork();
    }

    public void doWork() throws InterruptedException {
        Thread one = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                counter=++counter;
            }
        });

        Thread two = new Thread(() -> {
            for (int i = 0; i < 10000; i++)
                counter=counter+1;
        });

        one.start();
        two.start();

        one.join();
        two.join();

        System.out.println(counter);
    }
}
