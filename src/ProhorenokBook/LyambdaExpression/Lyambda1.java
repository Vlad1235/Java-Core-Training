package ProhorenokBook.LyambdaExpression;

import java.util.function.Function;

/**
 * Функциональные интерфейсы лишь они могут использовать лямбда выражениями!
 * Функциональный интерфейс это интрейфейс, описывающий  только один метод, который необходимо переопределить.
 */

public class Lyambda1 {
    public static void main(String[] args) {
        Lyambda1.test((n)-> n * 2,10);
    }
    public static void test(Function<Integer,Integer> f, int x){
        System.out.println(f.apply(x));
    }
}
/*
20
 */