package Cycles.old;

public class Output {
    /*
      Цикл в программировании используется для многократного повторения определенного фрагмента кода.
     В Java существует 3 оператора цикла: for, while, do-while.
    В этом уроке мы рассмотрим:
    Как применяются операторы цикла  for, while, do-while.
    Досрочный выход из цикла
     */

    public static void main(String[] args){
        CycleFor Output1 = new CycleFor();
        Output1.cycleFor1();
        System.out.println();
    }
}

/*
выводим чётные числа.

for (int x = 0; x < 9; x += 2)
    mInfoTextView.append(" " + x); // между кавычками пробел
Получим: 0 2 4 6 8
 */