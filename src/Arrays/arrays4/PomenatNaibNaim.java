package Arrays.arrays4;

public class PomenatNaibNaim {
    /*
    Поменять наибольший и наименьший элементы массива местами.
    Пример: дан массив {4, -5, 0, 6, 8}.  После замены должен выглядеть {4, 8, 0, 6, -5}.
     */
    public void pomenatNaibNaim() {
        int[] myArray = {13, -23, -42, 43, -42, 4, 6, 43};
        int max = myArray[0];
        int min = myArray[0];

        System.out.println("Изначальный массив: ");
        for ( int i = 0; i < myArray.length; i++){
            System.out.print(myArray[i] + " ,");
        }

        for (int i = 0; i < myArray.length; i++) { // изначально пытался все в один цикл запихать, но мне выдавался кривой ответ
            if (max < myArray[i]) {
                max = myArray[i];
            }
            if (min > myArray[i]) {
                min = myArray[i];
            }
        }
        System.out.println();
        System.out.println("Измененый массив: ");
        for (int i = 0; i < myArray.length; i++){ // Решил разделить, так как мне сказали, что я НАХОДИЛ МИНИМУМ и МАКСИСУМ СРАЗУ ЖЕ ИХ СРАВНИВАЛ С ТЕМ ЖЕ ЭЛЕМЕНТОМ. ПОЭТОМУ ОШИБКА
            if (myArray[i] == max) {
                myArray[i] = min;
            } else if (myArray[i] == min) {
                myArray[i] = max;
            }
            System.out.print(myArray[i] + " ,");
        }
    }
}
// САМ РЕШИЛ!!! Запомнить коментарии людей!!

