package Alishev.middleleveljava.lambda.lamdamoreusage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Самый полезный способ использования ламбда выражений - это использование их в специальных методах коллекций и массивов.
 * Эта функцинальность пришла из функциональных языков программирования
 * Главное, чтобы это был какой то массив данных.
 */
public class Test {
    public static void main(String[] args) {
        int[] arr = new int[10];
        List<Integer> list = new ArrayList<>();

        fillArr(arr);
        fillList(list);

        System.out.println(list); // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        System.out.println(Arrays.toString(arr)); // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

        // Задача, умножить все значения на 2. Способы выполнения.
        // Старый способ
//        for (int i=0;i<10;i++){
//            arr[i] = arr[i]*2;
//            list.set(i,list.get(i)*2);
//        }
//        System.out.println(list); // [2, 4, 6, 8, 10, 12, 14, 16, 18, 20]
//        System.out.println(Arrays.toString(arr)); // [2, 4, 6, 8, 10, 12, 14, 16, 18, 20]

        // новый способ с лямбда.
        /*
        1. Лабмда напрямую не может работать с коллекциями или массивами. Надо сначала вызвать статич метод stream из класса Arrays. Типо ОТКРЫВАЕМ ПОТОК

         2. Метод map() пришел в Java из функциональных языков программирования.
        Метод смысл из теории множеств "отображение" - сопостовлять поэлементно два множества оригинальное и преобразованное. Берет элементы и в соответствии с указанной логикой сопостовляем.
        Позволяет изменять наборы данных.
        Метод берет каждый элемент из набора данных и сопостовляем ему новый элемент.
        И вот это сопоставление мы описываем с помощью ламбда выражений.
        В этом методе мы указываем логику.
        Метод map() берет на вход набор элментов и начинает по нему итерироваться. То что мы возвращаем из лямба выражения и будет новым значением элемента.


         Когда получены разультаты напряму не получится сослать на массив, так как метод возвращает поток, поэтому должны вызвать метод toArray() он преобразует поток в массив
         с листом тот же фунционал collect(Collectors.toList());
         ТИПО ЗАКРЫВАЕМ ПОТОК и возвращем тот тип значения который нам нужен
        */

        arr = Arrays.stream(arr).map(a -> a * 2).toArray(); // мы обновляем старую переменную, поэтому присваиваем ей же ее же значения
        list = list.stream().map(a -> a * 2).collect(Collectors.toList());

        System.out.println(list);
        System.out.println(Arrays.toString(arr));

    }

    private static void fillList(List<Integer> list) {
        for (int i = 0; i < 10; i++) {
            list.add(i + 1);
        }
    }


    private static void fillArr(int[] arr) {
        for (int i = 0; i < 10; i++) {
            arr[i] = i + 1;
        }
    }
}
