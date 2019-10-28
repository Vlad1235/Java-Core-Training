package LaforteTraining.Ch3_TypesOfSorting.bubbleSort;

public class ArrayBub {
    private long[] a;                 // ref to array a
    private int nElems;               // number of data items
    //--------------------------------------------------------------
    public ArrayBub(int max)          // constructor
    {
        a = new long[max];                 // create the array
        nElems = 0;                        // no items yet
    }
    //--------------------------------------------------------------
    public void insert(long value)    // put element into array
    {
        a[nElems] = value;             // insert it
        nElems++;                      // increment size
    }
    //--------------------------------------------------------------
    public void display()             // displays array contents
    {
        for(int j=0; j<nElems; j++)       // for each element,
            System.out.print(a[j] + " ");  // display it
        System.out.println("");
    }
    /*
    Внешний цикл каждый раз сокращает фрагмент массива, так как
    внутренний цикл каждый раз ставит в конец фрагмента максимальный элемент
     */
    public void bubbleSort() {
        int out, in;
        for (out = nElems - 1; out > 1; out--)
            for (in = 0; in < out; in++)
                if (a[in] > a[in + 1]) {
                    long temp = a[in + 1];
                    a[in + 1] = a[in];
                    a[in] = temp;
                }
    }
}
/*
ПРОЩЕ НАПИСАТЬ!!!! таким образом пузырьковый алгоритм
           for (int i = 0; i < a.length - 1; i++)
            for (int j = 0; j < a.length - i - 1; j++)
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }

в цикле for надо int i=arr.length - 1 т.к если длина масива n,
то последний его элемент имеет номер n-1, потому что нумерация массива начинается с 0.
 */