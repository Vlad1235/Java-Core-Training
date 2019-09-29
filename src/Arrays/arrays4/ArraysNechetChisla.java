package Arrays.arrays4;

public class ArraysNechetChisla {
    /*
    Создайте массив, содержащий 10 первых нечетных чисел.
    Выведете элементы массива на консоль в одну строку, разделяя запятой.
     */
    public void arraysNechetChisla1(){
        int [] nechetChisla;
        nechetChisla = new int[20];


            for(int i =0;i < 20;i++){
                nechetChisla[i] = i;
                    if((i&1)!=0){
                        System.out.print(i + ",");
                    }
                }

            /*
             result = Integer.toString(x);
            StringBuffer strbuffer = new StringBuffer(result);
            strbuffer.deleteCharAt(19);
            System.out.println(strbuffer.toString());
*/
    }
}
// выводится 1, 3, 5, 7, 9, 11, 13, 15, 17, 19,  - нужно придумать как убрать , после 19
// дали совет через метод StringBuilder  - склеить и удалить последний символ

//Можно решить таким образом: заводим переменную для нечетных чисел, например х
// с начальным значением x=1. Затем делаем цикл по элементам массива и
// в этом цикле проводим операцию присваивания элементу массива х (array[i]=x) и
// операцию подсчитывающую следующее по порядку нечетного числа (x=x+2).