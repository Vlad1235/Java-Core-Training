package Arrays.arrays1;

public class Zadacha3 {
    /*
    Даны матрицы С и D размерностью 3 на 3 и заполненные случайными числами в диапазоне  от 0 до 99.
    Выполните по отдельности сначала сложение, потом умножения матриц друг на друга.
    Выведете исходные матрицы и результат вычислений на консоль.
     */
    public void zadacha31(){
        int [][] C = new int [3][3];
        int [][] D = new int [3][3];

        // матрица С
        System.out.println("Матрица C");
        for ( int i = 0; i< 3; i++){
            for ( int j = 0; j<3; j++){
                 C [i] [j] = (int)(Math.random()*100);
                System.out.print(C[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Матрица D");
        for ( int i = 0; i< 3; i++){
            for ( int j = 0; j<3; j++){
                D [i] [j]= (int)(Math.random()*100);
                System.out.print(D[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Сложение C и D");
        int [][] sum = new int [3][3];// изначально не работало, так как я не прописал данную строку
        for ( int i = 0; i< 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum [i][j] = C[i][j]+D[i][j];
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Умножение C и D");
        int [][] multiply = new int [3][3];// изначально не работало, так как я не прописал данную строку
        for ( int i = 0; i< 3; i++) {
            for (int j = 0; j < 3; j++) {
                multiply [i][j] = C[i][j]*D[i][j];
                System.out.print(multiply[i][j] + " ");
            }
            System.out.println();
        }
    }
}
