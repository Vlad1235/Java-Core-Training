package Cycles.cycles1;

public class Posledovatelnost {
    /*
    Вывести 10 первых чисел последовательности 0, -5,-10,-15..
     */

    // РЕШИЛ ЧЕРЕЗ СОЗДАНИЕ ПОЛЬЗОВАТЕЛЬСКОЙ ФУНКЦИИ!!!!! В ИНТРНЕТЕ ПРОЧИТАЛ ЧТО такое пользовательская фунция

    private static int func(int var_1){
        int n = 1;
        for ( int i = 0; i <= var_1; i++){
            n = -5*var_1;
        }
        return n;
    }

    public void posledovatelnost1(){
        int x = 10;
        for ( int i = 0; i < x; i++){
            int result = func(i);
            System.out.print(result);
        }
    }
}




