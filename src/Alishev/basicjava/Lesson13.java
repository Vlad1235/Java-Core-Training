package Alishev.basicjava;

/**
 * Java для начинающих. Урок 13: Многомерные массивы.
 */
public class Lesson13 {
    public static void main(String[] args) {
        int[] number = {1, 2, 3};
        System.out.println(number[1]);
        int[][] matrix = {{1, 2, 3, 12, 18},
                {4},
                {7, 8, 9}};

        System.out.println(matrix[2][2]);

        String[][] strings = new String[2][3];
        System.out.println(strings[0][1]); // null
        strings[0][1] = "Hello";
        System.out.println(strings[0][1]); // Hello

        for (int i = 0; i < matrix.length; i++) { // по строкам
            for (int j = 0; j < matrix[i].length; j++) { // по каждому элементу из строки
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }


    }
}
/*
2
9
null
Hello
1 2 3 12 18
4
7 8 9
 */