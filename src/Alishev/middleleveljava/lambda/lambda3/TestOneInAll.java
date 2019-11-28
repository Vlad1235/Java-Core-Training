package Alishev.middleleveljava.lambda.lambda3;

interface Executable {
    int execute(int x,int y);
}

class Runner {
    public void run(Executable e) {
        int a = e.execute(10,15);
        System.out.println(a);
    }
}


public class TestOneInAll {
    public static void main(String[] args) {
        Runner runner = new Runner();
        runner.run(new Executable() {
            @Override
            public int execute(int x,int y) {
                return x + y;
            }
        });

        //  Можем использовать другие переменные в лямбда выражении, однако эта перменная должна быть константой
        final int a = 10;
        runner.run((x,y)-> x + y+a);
    }
}
