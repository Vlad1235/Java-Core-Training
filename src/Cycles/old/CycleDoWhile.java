package Cycles.old;

public class CycleDoWhile {
    /*
     В отличие от оператора while, do-while  является оператором постусловия,
     который сначала выполняет тело цикла, а потом осуществляет проверку условия.
     Таким образом, тело цикла выполнится всегда хотя бы один раз.
    Конструкция do — while имеет следующий вид:
    do {
        //тело цикла
    }while(логическое_выражение);

    Как видно из конструкции, тело цикла выполняется перед проверкой условия.
    Впоследствии, тело цикла повторится в случае, если логическое_выражение было истинно.
    Оператор do-while  удобно применять, если некоторые действия необходимо выполнить,
    по крайней мере, один раз, а их повторение будет зависеть от условия.

     */

    public void cycleDoWhile(){
        /*
        Вспомним пример цикла while, который не выполнится ни разу,
        и перепишем его с помощью оператора do-while
        После выполнения цикла, на экран будет выведено значение i= 5.
         */
        int i = 5;
        do { System.out.println("i = " + i);
            i ++;
        } while (i > 6);
    }

}
