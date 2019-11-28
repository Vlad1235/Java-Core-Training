package Alishev.middleleveljava.lambda.impl2;



/**
 * старый способ до Лямбда реализовать через анонимный класс
 */
public class Test {
    public static void main(String[] args) {
        Runner runner = new Runner();
        runner.run(new Executable() {
            @Override
            public void execute() {
                System.out.println("hello");
            }
        });
    }
}
