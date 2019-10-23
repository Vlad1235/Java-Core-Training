package LaforteTraining.Ch2_Arrays.AbstractPersonInfoDraft;

/**
 * Реальная программа, использующая фамилию в качестве ключа, должна учесть возможность дублирования фамилий!
 */
public class DataFilling {
    public static void main(String[] args) {
        int maxSize = 100;             // array size
        PersonFindDeleteInsert arr;            // reference to array
        arr = new PersonFindDeleteInsert(maxSize);  // create the array
        // insert 10 items
        arr.insert("Evans", "Patty", 24);
        arr.insert("Smith", "Lorraine", 37);
        arr.insert("Yee", "Tom", 43);
        arr.insert("Adams", "Henry", 63);
        arr.insert("Hashimoto", "Sato", 21);
        arr.insert("Stimson", "Henry", 29);
        arr.insert("Velasquez", "Jose", 72);
        arr.insert("Lamarque", "Henry", 54);
        arr.insert("Vang", "Minh", 22);
        arr.insert("Creswell", "Lucinda", 18);

        arr.displayA();                // display items

        String searchKey = "Stimson";  // search for item
        PersonInfo found;
        found=arr.find(searchKey);
        if(found != null) {
            System.out.print("Found ");
            found.displayPerson();
        }
        else
            System.out.println("Can't find " + searchKey);

        System.out.println("Deleting Smith, Yee, and Creswell");
        arr.delete("Smith");           // delete 3 items
        arr.delete("Yee");
        arr.delete("Creswell");

        arr.displayA();                // display items again
    }  // end main()
}
/*
   Last name: Evans, First name: Patty, Age: 24
   Last name: Smith, First name: Lorraine, Age: 37
   Last name: Yee, First name: Tom, Age: 43
   Last name: Adams, First name: Henry, Age: 63
   Last name: Hashimoto, First name: Sato, Age: 21
   Last name: Stimson, First name: Henry, Age: 29
   Last name: Velasquez, First name: Jose, Age: 72
   Last name: Lamarque, First name: Henry, Age: 54
   Last name: Vang, First name: Minh, Age: 22
   Last name: Creswell, First name: Lucinda, Age: 18
Found    Last name: Stimson, First name: Henry, Age: 29
Deleting Smith, Yee, and Creswell
   Last name: Evans, First name: Patty, Age: 24
   Last name: Adams, First name: Henry, Age: 63
   Last name: Hashimoto, First name: Sato, Age: 21
   Last name: Stimson, First name: Henry, Age: 29
   Last name: Velasquez, First name: Jose, Age: 72
   Last name: Lamarque, First name: Henry, Age: 54
   Last name: Vang, First name: Minh, Age: 22
 */