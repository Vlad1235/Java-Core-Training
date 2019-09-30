package ProhorenokBook.LyambdaExpression;

import java.util.function.Function;

public class Lyambda6 {
    public static void main(String[] args) {
        // Function<T,R> f = (T n) -> n*2 обощенные типы данных, T - тип параметра, R - тип результата выполнения
        Function<Integer,Integer> f = (Integer n) -> n*2;
        int x = f.apply(20);
        System.out.println(x);
    }
}
/*
40
 */