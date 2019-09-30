package ProhorenokBook.LyambdaExpression;

import java.util.function.BiPredicate;

/**
 * Проверить числа на равенства
 */
public class Lyambda4 {
    public static void main(String[] args) {
        Lyambda4.test((a,b) -> a==b, 10, 10 );
        Lyambda4.test((a,b) -> a==b, 10, 20 );
    }
    public static void test(BiPredicate<Integer,Integer> f, int x, int y){
        System.out.println(f.test(x,y));
    }
}
/*
true
false
 */