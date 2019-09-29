package Arrays.job4j;

public class example {
    public static void main(String[] args){
        int[] numbers = new int[5];
            for(int index = 0; index != 5; index++){
                numbers[index] = index+1; // сам строку придумал, чтобы значениям в массиве были присвоены числа.
                /*
                Вывод на экран значений массива.
                 */
                int value = numbers[index];
                System.out.println(value);
            }
            System.out.println();
            // вывод чисел в обратном порядке.
            for(int index = 0; index != 5; index++){
                numbers[index] = numbers.length - index;
                System.out.println(numbers[index]);
            }
    }
}
/*
        1
        2
        3
        4
        5

        5
        4
        3
        2
        1
*/