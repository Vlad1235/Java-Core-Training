package Algorythms.GrokhaemAlgorytmyBook.RecursionAlgorythm;
/**
 * Рекурсия.
 * Рекурсия обязательно должа содержать базовый случай, чтобы алгоритм не был бесконечным.
 * Принцип работы стека
 */
public class Recursion {
    public static void main(String[] args) {
        int x = 5;
        int result = recursion(x);
        System.out.println("Итого: " + result);
    }
    public static int recursion(int x){
        if(x==1){
            return 1; // базовый случай
        } else {
            System.out.println(x); // строка для понимая как работает стек. (каждая следующая цифра не расчитывается, а сохраняется пока не дойдет до 1 и затем в обратном порядке умножается.
            return x*recursion(x-1); // рекурсивый случай
        }
    }
}
/*
5
4
3
2
Итого: 120
*/