package ProhorenokBook.Arrays;

import java.util.Arrays;

public class Mnogomerny_Initializating_array {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,6,7,8}};
        System.out.println(Arrays.deepToString(arr)+"\t");

        System.out.println(arr[0][0]);
        System.out.println(arr[1][0]);
        System.out.println(arr[1][3]);
        arr[1][3] = 10;
        System.out.println(Arrays.deepToString(arr));

        int[][] arr2 = new int[2][3];
        int n = 1;
        for( int i = 0; i < arr2.length; i++){
            for (int j = 0; j < arr2[i].length; j++){
                arr2[i][j] = n;
                System.out.print(arr2[i][j]+"\t");
                n +=1;
            }
        }
    }
}
/*
[[1, 2, 3, 4], [5, 6, 7, 8]]
1
5
8
[[1, 2, 3, 4], [5, 6, 7, 10]]
1	2	3	4	5	6
 */