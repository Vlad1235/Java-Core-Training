package Alishev.basicjava.recursion;
/**
При использовании рекурсии обязателен BaseCase условие выхода
 Exception in thread "main" java.lang.StackOverflowError
 */
public class Test {
    public static void main(String[] args) {
        counter(3);
        System.out.println(fac(4)); // 24
    }
    /*
    3
    2
    1
     */
    private static void counter(int n){ // вариант 1
        if (n==0) return; // условие выхода
        System.out.println(n);
        counter(n-1); // тут одновременно ждут и 3 и 2
    }

    /*
    1
    2
    3
    Американская горка, сначала по цепочке все открылись(но не закрылись), потом как дошли до вершины(не выполнения условия if) полетели вниз закрываться строго по очереди.
     */
    private static void counter2(int n){ // вариант СТЕКОВОГО ВЫЗОВА. LIFO. Самый последний завершает работу 1 и потом каждый закрывается по цепочке.
        if (n==0) return; // условие выхода
        counter(n-1); // тут одновременно ждут и 3 и 2
        System.out.println(n);
    }

/*
    fac(4)
    4*fac(3) 2*1*3*4
    3*fac(2) 2*1*3
    2*fac(1) 2*1
    fac(1)=return 1;
*/
    private static int fac(int n){
        if(n==1) return 1;
        return n*fac(n-1);
    }
}
