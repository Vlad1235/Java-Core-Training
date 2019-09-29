package Arrays;

import java.util.ArrayList;

// использование динамического массива HeadFirstJava.Collections.ArrayList< >
public class ArrayListMagnet {

        public static void main(String[] args) {

            ArrayList<String> a = new ArrayList<String>();

            a.add(0, "ноль"); //указать куда именно поместить объект при добавлении
            a.add(1, "один");
            a.add(2, "два");
            a.add(3, "три");
            printAL(a);
            if (a.contains("три")) {
                a.add("четыре");
            }
            a.remove(2);
            printAL(a);
            if (a.indexOf("четыре") != 4) {
                a.add(4, "4.2");
            }
            printAL(a);
            if (a.contains("два")) {
                a.add("2.2");
            }
            printAL(a);
        }

    public static void printAL (ArrayList<String> al) {

        for(String element: al) {
            System.out.print(element + " ");
        }
        System.out.println(" ");
    }
}
/*
ноль один два три
ноль один три четыре
ноль один три четыре 4.2
ноль один три четыре 4.2
 */