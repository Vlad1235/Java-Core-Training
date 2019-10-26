package LaforteTraining.Ch2_Arrays.ExcerciseProjects.Task24;


public class OrdArrayUsage {
    public static void main(String[] args) {
        int maxSize = 100;             // array size
        OrdArray arr = new OrdArray(maxSize);   // create the array

        arr.insert(77);                // insert 12 items
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(0);
        arr.insert(66);
        arr.insert(33);
        arr.insert(123456);
        arr.insert(12);

        arr.display();
        System.out.println(arr.size());

        int searchKey = 12;            // search for item
        if( arr.find(searchKey) != arr.size() )
            System.out.println("Found " + searchKey);
        else
            System.out.println("Can't find " + searchKey);

        arr.display();                 // display items

        arr.delete(33);                // delete 3 items
        arr.delete(55);
        arr.delete(99);
        arr.delete(0);
        arr.delete(123456);
        arr.delete(22);
        arr.delete(44);

        arr.display(); // display items again

    }  // end main()
}
/*
44 22 11 0 33 12 55 66 88 99 123456 77
12
Can't find 33
44 22 11 0 33 12 55 66 88 99 123456 77
44 11 0 33 12 66 88 77
 */