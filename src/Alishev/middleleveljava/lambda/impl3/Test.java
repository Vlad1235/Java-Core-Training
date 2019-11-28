package Alishev.middleleveljava.lambda.impl3;


/**
 *  способ реализации через Лямбда выражение
 */
public class Test {
    public static void main(String[] args) {
        Runner runner = new Runner();
        runner.run(()-> System.out.println("Hello"));
    }
}
