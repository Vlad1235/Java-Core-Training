package ProhorenokBook.LyambdaExpression;

import java.util.Random;
import java.util.function.Supplier;

/**
 * Вернем случайное целое число от 0 до 100 включительно.
 * Обратить внимание что здесь испльзуются скобки.
 */
public class Lyambda5 {
    public static void main(String[] args) {
        Lyambda5.test( ()-> {
            Random r = new Random();
            return r.nextInt(101);
        });
    }

    public static void test(Supplier<Integer> f){
        System.out.println(f.get());
    }
}
/*
64
 */