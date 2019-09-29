package Cycles.cycles1;

public class CycleFor {
    /*
    При помощи цикла for вывести на экран нечетные числа от 1 до 99.
     */

    public void cycleFor1(){
        int i;
        for (i = 1; i <= 99; i++){
            if((i&1) !=1 ){
                System.out.println("Четное число = " + i);
                i++;
            }
        }
    }
    public void cycleFor2(){
        int i;
        for (i = 1; i <= 99; i++){
            if( (i&1) != 0 ){
                System.out.println("Нечетное число = " + i);
                i++;
            }
        }
    }
}

//проверка числа i на нечетность if ((i&1)!=1).
// в этом случае наше первое число НЕ (!=1) является нечётным, то есть четным