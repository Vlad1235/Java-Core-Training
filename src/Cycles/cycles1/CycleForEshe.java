package Cycles.cycles1;

public class CycleForEshe {
    /*
    Дано число n при помощи цикла for посчитать факториал n!
    Факториал натурального числа n определяется как произведение всех натуральных чисел от 1 до n включительно
     */

    public void cycleForEshe1(){
        int n;
        int max = 5;
        int sum = 1;

         for ( n = 1; n <= max ; n++) {
             sum = sum*n;
             System.out.println("Факториал равен = " + sum );
         }
    }
}



