package LaforteTraining.Ch3_TypesOfSorting.InsertSort;

public class InsertSortApp {
    public static void main(String[] args)
    {
        int maxSize = 100;            // array size
        ArrayIns arr;                 // reference to array
        arr = new ArrayIns(maxSize);  // create the array

        arr.insert(77);               // insert 10 items
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(00);
        arr.insert(66);
        arr.insert(33);
        arr.insert(12);
        arr.insert(89);

        arr.display();                // display items

        arr.insertionSort();          // insertion-sort them

        arr.display();                // display them again
    }
}
/*
77 99 44 55 22 88 11 0 66 33 12 89
0 11 12 22 33 44 55 66 77 88 89 99
 */