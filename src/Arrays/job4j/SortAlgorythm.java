package Arrays.job4j;

import java.util.Arrays;

public class SortAlgorythm {


    public static void main(String[] args){
        int[] data = {5, 3, 2, 1, 4};
        int tmp = data[0]; //чтобы не затереть значение первой ячейки при замене.
        data[0] = data[3];
        data[3] = tmp;
        System.out.println(Arrays.toString(data));
    }
}
/*
[1, 3, 2, 5, 4]
 */