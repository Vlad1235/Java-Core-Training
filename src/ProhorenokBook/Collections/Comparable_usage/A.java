package ProhorenokBook.Collections.Comparable_usage;

/**
 * Чтобы можно было сравнивать элементы коллекции и сортировать их, необходимо чтобы объекты поддерживали интерфейс
 * Comparable<T>.
 * Интерфейс содержит один метод - int compareTo(T other). Возвращает либо 0, либо положительное число либо отрицательное число.
 *
 *Если нужно сортировать элементы в обратном порадке, то реализуется интерфейс Comparator<T>. Содержит метод
 * int compare(T a, T b)
 */
public class A implements Comparable<A> {
    private int x;
    private int y;
    public A(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    @Override
    public int compareTo(A other) {
        if (this.x > other.x) return 1;
        if (this.x < other.x) return -1;
        return 0;
    }
    @Override
    public String toString() {
        return "{" + this.x + ";" + this.y + "}";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + x;
        result = prime * result + y;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (this.getClass() != obj.getClass())
            return false;
        A other = (A) obj;
        if (this.x != other.x) return false;
        if (this.y != other.y) return false;
        return true;
    }
}
