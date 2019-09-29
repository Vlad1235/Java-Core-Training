package Arrays.arrays4;

public class SredArifmetich {
    /*
    Найти среднее арифметическое всех элементов массива.
    // среднее арифметическое - сумма всех чисел деленная на их количество

     */
    public void sredArifmetich1 () {
        int [] arr = {4,5,23,25,12,-42,12,45,66,41,0,8,9};
        int average = 0;
        int sum = 0;
                for ( int i = 0; i < arr.length; i++){
                    sum = sum + arr[i];
        }
                System.out.println(sum);

                average = sum/arr.length;
                System.out.println(average);
    }
}
