package LaforteTraining.Ch2_Arrays.Search_Delete_Insert_viaOrderedArray;

public class OrdArrayUsage {
    public static void main(String[] args) {
        int maxSize = 100;             // array size
        OrdArray arr;                  // reference to array
        arr = new OrdArray(maxSize);   // create the array

        arr.insert(77);                // insert 10 items
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(00);
        arr.insert(66);
        arr.insert(33);

        int searchKey = 128;            // search for item
        if( arr.find(searchKey) != arr.size() )
            System.out.println("Found " + searchKey);
        else
            System.out.println("Can't find " + searchKey);

        arr.display();                 // display items

        arr.delete(0);                // delete 3 items
        arr.delete(55);
        arr.delete(99);

        arr.display();                 // display items again
    }  // end main()
}
/*
Can't find 128
0 11 22 33 44 55 66 77 88 99
11 22 33 44 66 77 88
 */