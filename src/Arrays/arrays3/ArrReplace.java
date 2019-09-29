package Arrays.arrays3;

public class ArrReplace {
 /*
    скачал пример от другого
    Поменять наибольший и наименьший элементы массива местами.
     */

    public void arrReplace() {
        //конструктор
        int min;
        int max;
        int n = 5;
        int[] numberArray = {4, 3, 2, 1, 0};

        //Вывод на экран массива
        System.out.println("Массив:");
        for (int i = 0; i < n; i++) {
            System.out.print(numberArray[(i)] + ",");
        }

        // с красной строки начать
        System.out.println();

        //Поиск наибольшего значения
        max = numberArray[0];
        for (int i = 0; i < n; i++) {
            if (numberArray[i] > max) {
                max = numberArray[i];
            }
        }
        //Поиск наименьшего значения
        min = numberArray[0];
        for (int i = 0; i < n; i++) {
            if (numberArray[i] < min) {
                min = numberArray[i];
            }
        }

        //Вывод на экран максимального и минимального значений
        System.out.println("Максимальное значение массива " + max);
        System.out.println("Минимальное значение массива " + min);

        //Перемена местами максимального и минимального значений
        for (int i = 0; i < n; i++) {
            if (numberArray[i] == min) {
                if (numberArray[i] == max) {
                    numberArray[i] = min;
                }
                if (numberArray[i] == min) {
                    numberArray[i] = max;
                }
            } else {
                if (numberArray[i] == max) {
                    numberArray[i] = min;
                }
            }
        }

        //Вывод на экран конечного массива
        System.out.println("Массив после перемены наибольшего и наименшего элементов местами:");
        for (int i = 0; i < n; i++) {
            System.out.print(numberArray[(i)] + ",");
        }
        System.out.println();
    }
}

/*Массив:
        4,3,2,1,0,
        Максимальное значение массива 4
        Минимальное значение массива 0
        Массив после перемены наибольшего и наименшего элементов местами:
        0,3,2,1,4,

 */

