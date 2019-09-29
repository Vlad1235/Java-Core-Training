package Arrays.arrays1;

public class Zadacha4 {
    /*
    Просуммируйте все элементы двумерного массива.
     */
    public void zadacha41(){
        int [][] masiv = new int[2][2];
        int sum=0;

        for(int i = 0; i<2; i++){
            for( int j = 0; j<2; j++){
                masiv[i][j] = (int)(Math.random()*10);
                System.out.print(masiv[i][j] + "\t");
                sum = sum + masiv[i][j];
            }
            System.out.println();
        }
        System.out.println();
        System.out.print( " сумма двумерного массива: "+ sum);
    }
}
/*
5	3
7	9
 сумма двумерного массива: 24
 */
