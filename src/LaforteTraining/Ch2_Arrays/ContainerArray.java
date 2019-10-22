package LaforteTraining.Ch2_Arrays;

/**
 * Класс контейнер. Тут формируется массив и от сюда запрашиваются данные для работы
 */
public class ContainerArray {
    private long[] a;

    public ContainerArray(int size)
    { a = new long[size]; }

    public void setElem(int index, long value)
    { a[index] = value; }

    public long getElem(int index)
    { return a[index]; }
}
