package Arrays.arrays1;

public class Zadacha1 {
    /*
    Создайте массив размерностью 5 на 6 и заполните его случайными числами
    (в диапазоне от 0 до 99 ).
     */


    public void zadacha11(){
        int [][] masiv;
        masiv = new int [5][6];

        for ( int i = 0; i < 5; i++){
                for( int j = 0; j < 6; j++ ){
                   masiv[i][j] = (int)(Math.random()*100); // сразу присваивать звачения и i и j  - он ругается если раздельно каждому
                    System.out.print(masiv[i][j] + "\t");
                }
                System.out.println();
        }
    }
}
/*
25	69	25	66	74	47
65	54	11	85	65	45
19	77	29	3	42	18
8	46	82	57	84	65
9	54	94	71	52	65
 */