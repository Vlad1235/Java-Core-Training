package HeadFirstJava.Collections.ArrayList;

import java.util.ArrayList;


public class myList {
    public static void main(String[] args) {
        ArrayList<Egg> myCountChicken = new ArrayList<Egg>();
        Egg one = new Egg();
        myCountChicken.add(one);
        Egg two = new Egg();
        myCountChicken.add(two);
        int size = myCountChicken.size();
        System.out.println(size);
        myCountChicken.remove(two);
        size = myCountChicken.size();
        System.out.println(size);
    }
}
/*
2
1
 */