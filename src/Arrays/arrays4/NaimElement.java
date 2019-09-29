package Arrays.arrays4;

public class NaimElement {
    /*
     Дан массив размерности N,  найти наименьший элемент массива и вывести на
      консоль (если наименьших элементов несколько — вывести их все).

     */
    public void naimElement1(){
        int [] myArray = {13,-23,-42,43,-42,4,6,2};
        int min = myArray[0];
        int n = 0;
        for( int i = 0; i < myArray.length; i++){
            if(min>myArray[i]){
                min = myArray[i];
                n = n+1;
            }
        }
        System.out.println(min + "повторение = " + n + " раз");
    }
}
