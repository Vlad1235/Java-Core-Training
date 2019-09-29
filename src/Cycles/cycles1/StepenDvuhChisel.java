package Cycles.cycles1;

public class StepenDvuhChisel {
    /*
    Даны переменные x и n вычислить x^n.
     */
    public void stepenDvuhChisel1(){
        int x, n;
        x = 2;
        n = 1;
        double sum;


        if( n >= 0 ){
           sum = Math.pow(x,n);
            System.out.println(sum);

        } else if ( n < 0) {
            sum = Math.pow(x,-n);
            System.out.println(sum);
        }
    }
}
// Использовал фунцию Math.pow(x,n); и еще одно требование фунции, значения должны быть в примитивном типе DOUBLE!!!

//
// То есть насколько я понял существует только один вариант возведения в степень и он работает с типами double ???
// В реализации - да. Но вы можете делать возведение в степень и для int значений.
//public class TestPower {
//
//    public static void main(String[] args) {
//        int base = 2;
//        int power = 2;
//        System.out.println("Result: " + (int)Math.pow(base, power));
//    }
//}