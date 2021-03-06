package Cycles.old;

public class CycleFor {

    /*
        Конструкция for имеет следующий вид:
     for (инициализация; условие; итерация) {
    тело цикла;
     }

     Инициализация — первый параметр, который содержит переменную и ее начальное значение.
     С помощью этой переменной будет подсчитываться количество повторений цикла.
     В нашем примере это переменная int i = 1.

     Условие — второй параметр, содержит некоторое логическое выражение — условие
     при котором будет выполняться цикл.
     В нашем примере это условие i <= 10.

      Итерация — третий параметр, выражение, изменяющее переменную (заданную в инициализации)
     ПОСЛЕ каждого шага цикла.
      Изменение происходит только в случае выполнения условия.
      В нашем примере итерация i++ — увеличение переменной на единицу.
      i=i+1 ЗАПОМНИТЬ ПРИМЕР С ФАКТОРИАЛОМ!!! - тут значит переменная еще до начала каждого следующего цикла увеличивается на 1
      Также для итерации часто используется i— — уменьшение переменной на единицу.
     */

    // Рассмотрим пример: вывод на экран числа от 1 до 10 в строчку.
    public void cycleFor1() {
        for (int i = 1; i <= 10; i=i+1) {
            System.out.println(i + " ");
        }

// Пример2: Вывод на экран чисел от 10 до −10 в строчку:
        for (int i = 10; i >= -10; i--) {
            System.out.print(i + " ");
        }
    }
}