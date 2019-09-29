package ProhorenokBook.Arrays;

/**
 * Перебоор элементов массива. Нумерация.
 */
public class Numbering_array {
    public static void main(String[] args) {
        int[] arr = new int[5];
        /*
        Нумеруем все элементы массива
         */
        for(int i = 0, j = 1; i < arr.length; i++, j++){
            arr[i] = j;
            System.out.print(arr[i]+"\t");
        }
        /*
        Нумеруем все элементы массива
         */
        int[] arr2 = new int[6];
        int i = 0, j = arr2.length;
        while(i < arr2.length){
            arr2[i] = j;
            System.out.print(arr2[i]+"\t");
            i++;
            j--;
        }
    }
}
/*
1	2	3	4	5	6	5	4	3	2	1
 */
