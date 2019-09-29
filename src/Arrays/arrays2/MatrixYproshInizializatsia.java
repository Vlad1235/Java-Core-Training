package Arrays.arrays2;

public class MatrixYproshInizializatsia {
    /*
    Для матрицы B воспользуемся упрощенным способом инициализации — в момент объявления.
    По аналогии с одномерными массивами. int [] arr = { 1, 2, 3, 4, 5}
     */
    public void matrixYproshInizializatsia1(){
        // 3 строки 3 столбца
        int[][] matrixB = {
                {-9,1,0},
                {4,1,1},
                {-2,2,-1}
        };
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrixB[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
