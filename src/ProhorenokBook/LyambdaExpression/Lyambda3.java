package ProhorenokBook.LyambdaExpression;

import java.util.function.Predicate;

/**
 * Проверка неравенства целого числа 0
 */
public class Lyambda3 {
    public static void main(String[] args) {
       Lyambda3.test( n -> n != 0, 10);
       Lyambda3.test( n -> n != 0, 0);
    }
    public static void test(Predicate<Integer> f, int x){
        System.out.println(f.test(x));
    }
}
/*
true
false
 */