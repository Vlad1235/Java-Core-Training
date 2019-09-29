package Info_to_method.Array;

import java.util.Arrays;

/**
 *
 */
public class MyClass {

    public static void func(int[] arr){
        arr[0] = 9;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,4,5,6};
        System.out.println(Arrays.toString(arr));
        func(arr.clone()); // НЕ изменится так как мы создали копию оригинала массива и ее изменили.
        System.out.println(Arrays.toString(arr)); //НЕ изменилось
        func(arr); // изменится так как мы будем через ссылку проводить операции с оригиналом массива.
        System.out.println(Arrays.toString(arr)); //изменилось

    }
}
/*
[1, 2, 3, 4, 5, 6]
[1, 2, 3, 4, 5, 6]
[9, 2, 3, 4, 5, 6]
 */