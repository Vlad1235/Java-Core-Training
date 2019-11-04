package LaforteTraining.Ch2_Arrays.ExcerciseProjects.Task21;

public class HighArray {

        private long[] a;                 // ref to array a
        private int nElems;               // number of data items
        private long[] b = new long[nElems];

        //-----------------------------------------------------------
   public HighArray(int max)         // constructor
        {
            a = new long[max];                 // create the array
            nElems = 0;                        // no items yet
        }
        //-----------------------------------------------------------
        public boolean find(long searchKey)
        {                              // find specified value
            int j;
            for(j=0; j<nElems; j++)            // for each element,
                if(a[j] == searchKey)           // found item?
                    break;                       // exit loop before end
            if(j == nElems)                    // gone to end?
                return false;                   // yes, can't find it
            else
                return true;                    // no, found it
        }  // end find()
        //-----------------------------------------------------------
        public void insert(long value)    // put element into array
        {
            a[nElems] = value;             // insert it
            nElems++;                      // increment size
        }
        //-----------------------------------------------------------
        public boolean delete(long value)
        {
            int j;
            for(j=0; j<nElems; j++)        // look for it
                if( value == a[j] )
                    break;
            if(j==nElems)                  // can't find it
                return false;
            else                           // found it
            {
                for(int k=j; k<nElems; k++) // move higher ones down
                    a[k] = a[k+1];
                nElems--;                   // decrement size
                return true;
            }
        }  // end delete()
        //-----------------------------------------------------------
        public void display(String origin) {             // displays array contents
            if (origin.equals("origin")) {
                for (int j = 0; j < nElems; j++)       // for each element,
                    System.out.print(a[j] + " ");  // display it
                System.out.println("");
            } else {
                for (int j = 0; j < nElems; j++)       // for each element,
                    System.out.print(b[j] + " ");  // display it
                System.out.println("");
            }
        }
        //-----------------------------------------------------------

    /**
     * Написать метод, который возвращает наибольшее значение из массива
     * @return
     */
        public long getMax(){
            if(a.length != 0) {
                for (int index = 0; index < a.length; index++) {
                    for (int index1 = 0; index1 < a.length - 1; index1++) {
                        if (a[index1] < a[index1 + 1]) {
                            long temp = a[index1];
                            a[index1] = a[index1 + 1];
                            a[index1 + 1] = temp;
                        }
                    }
                }
                return a[0];
            } else return -1;
        }

    /**
     * Метод для удаления наибольшего элемента массива
     */
        public void removeMax(){
                for (int index = nElems;index < nElems;index--){
                            a[index] = a[index+1]; // сравниваем предыдущий и текущий.
                        }
                nElems--;
        }

        public long[] sortArray(){ //
                for (int x=0;x<a.length;x++){
                    b[x] = a[x];
                };
                    for (int index = 0; index<b.length;index++){
                        for (int index1 = 0;index1<b.length-1;index1++){
                            if (b[index1] < b[index1+1]){
                                    long tmp = b[index];
                                    b[index]=b[index+1];
                                    b[index+1] = tmp;
                            }
                        }
                    }
                    return b;
                }
}



