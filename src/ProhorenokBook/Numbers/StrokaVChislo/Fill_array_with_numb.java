package ProhorenokBook.Numbers.StrokaVChislo;

import java.util.Random;

/**
 * метод nextByte(arr[]) класса Random помогает заполнить массив случайными числами, но только в типа Byte.
 */
public class Fill_array_with_numb {
    public static void main(String[] args) {
        byte[] arr = new byte[10];
        Random r = new Random();
        r.nextBytes(arr);
        for(byte x :arr){
            System.out.print(x + " ");
        }
    }
}
/*
19 49 63 -3 -56 1 -86 65 -94 -21
 */