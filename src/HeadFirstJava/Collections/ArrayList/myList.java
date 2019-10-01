package HeadFirstJava.Collections.ArrayList;

import java.util.ArrayList;
import java.util.Collections;


public class myList {
    public static void main(String[] args) {
        new myList().go();
    }

    public void go(){
        Pig obj1 = new Pig("Nifnif");
        Pig obj2 = new Pig("Foffof");
        Pig obj3 = new Pig("Hruhru");
        Pig obj4 = new Pig("Leonard");
        ArrayList<String> arr = new ArrayList<String>();
        arr.add(obj1.getNameOfPig());
        arr.add(obj2.getNameOfPig());
        arr.add(obj3.getNameOfPig());
        arr.add(obj4.getNameOfPig());
        Collections.sort(arr); // ArrayList автоматически не сортирует добавляемые в него значения.
        System.out.println(arr.size());
        System.out.println(arr);
    }
}
/*
4
[Foffof, Hruhru, Leonard, Nifnif]
 */