package Alishev.middleleveljava.lambda;

interface Executable{
    int execute();
}

class Runner{
    public void run(Executable e){
        int a = e.execute();
        System.out.println(a);
    }
}



public class TestOneInAll {
    public static void main(String[] args) {
        Runner runner = new Runner();
        runner.run(new Executable() {
            @Override
            public int execute() {
                return 1;
            }
        });

        runner.run(()-> 1);
    }
}
