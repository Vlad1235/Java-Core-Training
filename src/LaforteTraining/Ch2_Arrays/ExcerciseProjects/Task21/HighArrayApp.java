package LaforteTraining.Ch2_Arrays.ExcerciseProjects.Task21;

import java.util.Arrays;

public class HighArrayApp {
    public static void main(String[] args) {
        int maxSize = 100;            // array size
        HighArray arr;                // reference to array
        arr = new HighArray(maxSize); // create the array

        arr.insert(77);               // insert 10 items
        arr.insert(99);
        arr.insert(80);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(00);
        arr.insert(66);
        arr.insert(33);
        arr.insert(10000);
        arr.insert(123456);
        arr.insert(1);
        arr.display("origin");                // display items

        int searchKey = 35;           // search for item
        if( arr.find(searchKey) )
            System.out.println("Found " + searchKey);
        else
            System.out.println("Can't find " + searchKey);

        arr.delete(00);               // delete 3 items
        arr.delete(55);
        arr.delete(99);
        arr.display("origin");                // display items again


//        System.out.println(arr.getMax());
//        arr.display("Nonorigin");
//        arr.removeMax();

//        arr.display("noorigin");
    }  // end main()
}
/*
77 99 80 55 22 88 11 0 66 33 10000 123456
Can't find 35
77 80 22 88 11 66 33 10000 123456
123456
10000 88 80 77 66 33 22 11
[10000, 88, 80, 77, 66, 33, 22, 11, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
10000 88 80 77 66 33 22 11
 */