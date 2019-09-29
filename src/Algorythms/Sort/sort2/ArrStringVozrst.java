package Algorythms.Sort.sort2;

import java.util.Arrays;
import java.util.Collections;

public class ArrStringVozrst {
    /*
    Создайте массив содержащий марки автомобилей, отсортируйте его сначала по возрастанию, потом по убыванию.
     */
    public void arrStringVozrst() {
        String[] marki = new String[]{"BMW", "Audi", "Mersedes", "Toyota", "Mitsubishi"};
        Arrays.sort(marki);
        for (int i = 0; i < marki.length; i++) {
            System.out.print(marki[i] + " ,");
        }
        System.out.println();
        Arrays.sort(marki, Collections.reverseOrder());
        for (int i = 0; i < marki.length; i++) {
            System.out.print(marki[i] + " ,");
        }
    }
}
/*
Audi ,BMW ,Mersedes ,Mitsubishi ,Toyota ,
Toyota ,Mitsubishi ,Mersedes ,BMW ,Audi ,
 */