package LaforteTraining.Ch2_Arrays;

/**
 * Непосредственные присвоения и вычисления тут.
 * Форматирование кода взято из Лафорте. Запомнить.
 */
public class Calculation {
    public static void main(String[] args) {
        ContainerArray arr;
        arr = new ContainerArray(100);      // create ContainerArray object
        int nElems = 0;               // number of items in array
        int j;

        arr.setElem(0, 77);
        arr.setElem(1, 99);
        arr.setElem(2, 44);
        arr.setElem(3, 55);
        arr.setElem(4, 22);
        arr.setElem(5, 88);
        arr.setElem(6, 11);
        arr.setElem(7, 0);
        arr.setElem(8, 66);
        arr.setElem(9, 33);
        nElems = 10;                 // now 10 items in array

        for(j=0; j<nElems; j++){      // display items
            System.out.print(arr.getElem(j) + " ");
        }
        System.out.println("");

        int searchKey = 26;          // search for data item
        for(j=0; j<nElems; j++)            // for each element,
            if(arr.getElem(j) == searchKey) // found item?
                break;
        if(j == nElems)                    // no
            System.out.println("Can't find " + searchKey);
        else                               // yes
            System.out.println("Found " + searchKey);

        // delete value 55
        for(j=0; j<nElems; j++)            // look for it
            if(arr.getElem(j) == 55)
                break;
        for(int k=j; k<nElems; k++)        // higher ones down
            arr.setElem(k, arr.getElem(k+1) );
        nElems--;                          // decrement size

        for(j=0; j<nElems; j++)      // display items
            System.out.print( arr.getElem(j) + " ");
        System.out.println("");
    }
}
