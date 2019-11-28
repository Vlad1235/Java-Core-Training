package Alishev.middleleveljava.lambda.lambda4;

interface Executable {
    int execute(int x, int y);
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
        int a = 1;
        runner.run(new Executable() {
            @Override
            public int execute(int x,int y) { //   метода ЕСТЬ своя область видимости, он не видит переменную вне ее.
                int a = 2;
                return x + y;
            }
        });

        //  У лябмда выражения НЕТ своей области видимости(scope). Поэтому внутри лябда создать ту же переменную не удастся

        runner.run((x,y)-> {
         //   int a = 1; выдается ошибка, так как уже инициализирована в области видимости (метод main)
            int b = 1;
            return x + y;
        });
    }
}
