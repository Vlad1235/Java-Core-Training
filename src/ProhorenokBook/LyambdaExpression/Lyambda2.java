package ProhorenokBook.LyambdaExpression;

import java.util.function.BiFunction;

/**
 * Суммирование 2 чисел
 */
public class Lyambda2 {
    public static void main(String[] args) {
        Lyambda2.test((a,b) -> a+b, 10, 20);
    }
    public static void test(BiFunction<Integer,Integer,Integer> f, int x, int y){
        System.out.println(f.apply(x,y));
    }
}
/*
30
 */