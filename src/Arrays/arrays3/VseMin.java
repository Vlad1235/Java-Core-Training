package Arrays.arrays3;

public class VseMin {
   /*
    Скопировал от другого
    Вывести все минимальные значения из массива
     */

    public void primer1() {
        int [] arr = {1,2,-7,-4,5,6,-7,8,9,10,-7,12,13,14,-7,15,-7};
        int min = arr[0];
        int min1 = arr [0];
        int min_i = 0;
        for ( int i = 0; i < arr.length; i ++){
            if (min > arr[i]){
                min = arr[i];
                min_i = i;

            }
        }
        System.out.print(min + ",");

        for (int j = min_i + 1; j < arr.length; j ++){
            if (min == arr[j] ){
                min1=arr[j];
                System.out.print(min1 + ",");

            }
        }

    }
}
// Понятен его принцип - он просто исключил первую минимальную! и начал второй цикл со второго значнеия