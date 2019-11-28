package Alishev.middleleveljava.lambda.lambda2;

interface Executable {
    int execute(int x);
}

class Runner {
    public void run(Executable e) {
        int a = e.execute(10);
        System.out.println(a);
    }
}


public class TestOneInAll {
    public static void main(String[] args) {
        Runner runner = new Runner();
        runner.run(new Executable() {
            @Override
            public int execute(int x) {
                return x + 5;
            }
        });

        runner.run(x-> x + 5); // круглые скобки нужны лишь тогда, когда несколько аргументов в сигнатуре метода. Также можно не указывать тип передаваемого значения
    }
}
