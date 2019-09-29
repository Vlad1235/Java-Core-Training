package Arrays.arrays1;

public class Zadacha2 {
    /*
     Создайте и выведите массив размерностью 5 на 6 и заполните его случайными числами
    (в диапазоне от 0 до 99 ). Выведите на консоль 1  строку

     */
    public void zadacha21() {
        int[][] masiv = new int[5][6];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                masiv[i][j] = (int) (Math.random() * 100);
                if (i == 0) System.out.print(masiv[i][j] + " ");
                }
            System.out.println();
        }
    }
}

