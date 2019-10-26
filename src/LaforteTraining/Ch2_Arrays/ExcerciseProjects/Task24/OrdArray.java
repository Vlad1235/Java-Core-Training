package LaforteTraining.Ch2_Arrays.ExcerciseProjects.Task24;

/**
 * Упорядоченный массив(сортированный)
 * Операции:
 * 1.Поиска
 * 2. Вставки
 * 3. Замены
 * все поддерживают двоичный поиск. Место замены, удаления определяется двоичным поиском.
 * Однако! Одинаковые значения запрещены!
 */
public class OrdArray {

        private long[] a;                 // ref to array a
        private int nElems;               // number of data items


   public OrdArray(int max) {         // constructor
            a = new long[max];             // create array
            nElems = 1;
            a[0] = 0;
        }

        public int size() {
            return nElems;
        }

    /**
     * Метод ищет заданный элемент многократным половинным делением диапазона элементов массива
     * @param searchKey
     * @return curIn
     */
    public long find(long searchKey) {
            int curInn; // текущий индекс
//            Arrays.sort(a);
            int lowerBound = 0;
            int upperBound = nElems-1;

            while(true) {
                curInn = (lowerBound + upperBound ) / 2; // Индекс устанавливается в середину этого диапазона
                if(a[curInn] == searchKey)
                    return a[curInn];              // проверка на дурака, вдруг с первого раза попадет
                else if(lowerBound > upperBound) // В конечном итоге массив сократится настолько, что дальнейшее деление станет невозможным. Тут это проверяется и если выполняется, значит поиск завершен.
                    return nElems;             // Поиск не может продолжаться без диапазона.Если заданный элемент не найден, метод возвращает общее количество элементов. Пользователь понимает это как показатель, что значение не найдено.
                else                          // деление диапазона
                    if(a[curInn] < searchKey) // текущий индекс curInn = середине диапазона со значением
                        lowerBound = curInn + 1; // Если searchKey больше, то поиск осуществлять в верхнем диапазоне. Нужно присвоить индекс следующей ячейки.
                    else
                        upperBound = curInn - 1; // иначе в нижнем. Нужно ограничить нижней половиной.
                }  // end while
            }  // end find()


        public void insert(long value) {// put element into array
            int middleIndex;
            int lowerBound = 0;
            int upperBound = nElems-1;


                for (int index = 0; index < nElems-1; index++) {
                    for (int index1 = 0; index1 < nElems - 2; index1++) {
                        if (a[index1] < a[index1 + 1]) { // по убыванию
                            long tmp = a[index1];
                            a[index1] = a[index1 + 1];
                            a[index1 + 1] = tmp;
                        }
                    }
                }

                while (true) {
                    middleIndex = (lowerBound + upperBound) / 2;
                    if (a[middleIndex] == value && a[upperBound] > value) {
                        break;
                    } else if (lowerBound >= upperBound) {
                        break;
                    } else if (a[middleIndex] < value) {
                        upperBound = middleIndex - 1;
                    } else {
                        lowerBound = middleIndex + 1;
                    }
                }
                a[middleIndex+1] = value;
                nElems++;

//            for(k = nElems; k > middleIndex; k--)    // перемещение последующих элементов вверх
//                a[k] = a[k-1];
//            a[middleIndex] = value;                  // insert it
//            nElems++;                      // increment size
            }




        public boolean delete(long value) {
            long j = find(value);           // вызов метод поиска
            long k;
            if(j==nElems)                  // can't find it
                return false;
            else {                        // found it
                for( k = j; k < nElems; k++) // move bigger ones down
                    a[(int)k] = a[(int)k+1];
                nElems--;                   // decrement size
                return true;
            }
        }  // end delete()


        public void display()    {         // displays array contents
            for(int j=0; j<nElems; j++)       // for each element,
                System.out.print(a[j] + " ");  // display it
            System.out.println("");
        }

}  // end class OrdArray

