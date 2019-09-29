package Arrays.arrays4;

public class NaibElement {
    /*
    Дан массив размерности N,  найти наибольший элемент массива и вывести на
      консоль (если наибольших элементов несколько — вывести их все).
     */
    public void naibElement(){
        int [] myArray = {13,-23,-42,13,-42,4,6,2};
        int max = myArray[0];
        int n = 0;
            for(int i = 0; i < myArray.length; i++){ // Менять в цикле НИКОГДА НЕ НАДО НИЧЕГО!
                if(max<=myArray[i]){
                    max = myArray[i];
                    n = n+1;
                }
            }
            System.out.println(max + " повторение было " + n + " раз");
    }
}
