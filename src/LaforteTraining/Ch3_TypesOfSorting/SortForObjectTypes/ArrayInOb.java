package LaforteTraining.Ch3_TypesOfSorting.SortForObjectTypes;

/**
 * Метод compareTo() - возвращает разные целочисленные значения(-1,0,1) в зависимости от
 * относительного лексиграфического(алфавитного) расположения объекта String , для которого вызван метод и
 * объекта String переданного в аргументе.
 *
 * Например, если s1 содержит cat, а s2 содержит dog, то функция вернет отрицательное число -1
 * если s1=s2, то 0
 */
public class ArrayInOb {
    private Person[] a;               // ref to array a
    private int nElems;               // number of data items
    //--------------------------------------------------------------
    public ArrayInOb(int max)         // constructor
    {
        a = new Person[max];               // create the array
        nElems = 0;                        // no items yet
    }
    //--------------------------------------------------------------
    // put person into array
    public void insert(String last, String first, int age)
    {
        a[nElems] = new Person(last, first, age);
        nElems++;                          // increment size
    }
    //--------------------------------------------------------------
    public void display()             // displays array contents
    {
        for(int j=0; j<nElems; j++)       // for each element,
            a[j].displayPerson();          // display it
    }
    //--------------------------------------------------------------
    public void insertionSort()
    {
        int in, out;
        for(out=1; out<nElems; out++)
        {
            Person temp = a[out];       // скопировать помеченный элемент
            in = out;                   // начать перемещение с out

            while(in>0 &&               // пока не найдем меньший элемент,
                    a[in-1].getLast().compareTo(temp.getLast())>0)
            {
                a[in] = a[in-1];         // сдвинуть элемент вправо
                --in;                    // перейти на 1 индекс влево
            }
            a[in] = temp;               // вставить помеченный элемент
        }  // end for
    }  // end insertionSort()
//--------------------------------------------------------------
}
