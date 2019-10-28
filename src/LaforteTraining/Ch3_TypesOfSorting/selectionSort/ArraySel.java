package LaforteTraining.Ch3_TypesOfSorting.selectionSort;

/**
 * Алгоритм сортировки методом выбора превосходит пузырьковую по КОЛИЧЕСТВУ НЕОБХОДИМЫХ ПЕРЕСТАНОВОК
 * пузырьковая O(N^2) против O(N)
 * Однако количество сравненией остается равным O(N^2).
 *
 *
 */
public class ArraySel {
        private long[] a;                 // ref to array a
        private int nElems;               // number of data items
//--------------------------------------------------------------
   public ArraySel(int max)          // constructor
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
Последовательно перебераем всех игроков и выбираем самого низкорослого их них.
Этот игрок МЕНЯЕТСЯ МЕСТАМИ с тем, который стоит в крайней левой позиции.
Левый игрок отсортирован и уже в дальнейшем перемещаться не будет!
Следующий проход начинается с индекса 1 и обнаруженный следующий минимальный меняется местами.
В данном алгоритме отсортированные игроки собираются слева, а в пузырьковой к концу массива
Данный алгоритм выигрывает, только за счет меньшего количества необходимых перестановок.
 */
        public void selectionSort() {
            int out, in, min;
            for (out = 0; out < nElems - 1; out++)   // outer loop
            {
                min = out;                     // minimum
                for (in = out + 1; in < nElems; in++) { // inner loop
                    if (a[in] < a[min])         // if min greater,
                        min = in;               // we have a new min
                    long temp = a[out];
                    a[out] = a[min];
                    a[min] = temp;
                }
            }
        }// end selectionSort()

}
