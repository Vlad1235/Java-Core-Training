package Alishev.middleleveljava.lambda.impl1;

/**
 * старый способ до Лямбда через отдельный класс
 */
public class Test {
    public static void main(String[] args) {
        Runner runner = new Runner();
        runner.run(new ExecutableImpl());
    }
}
