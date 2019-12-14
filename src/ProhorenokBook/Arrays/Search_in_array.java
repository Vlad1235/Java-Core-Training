package ProhorenokBook.Arrays;

/**
 * Поиск элементов в неотсортированном массиве. Чисто для обучения, так как в реальности так не делают, очень долго.
 */
public class Search_in_array {
    public static int search(int[] arr, int key){
        int index = -1;
        for ( int i = 0; i < arr.length; i++){
            if(arr[i] == key){
                index = i;
                break;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int[] arr = {10,5,6,1,3}; // неотсортированный массив.
        System.out.println(search(arr,5));
    }
}
