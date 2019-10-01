package ProhorenokBook.Collections.Comparable_usage;
import java.util.Comparator;

public class ReverseX implements Comparator<A> {
    @Override
    public int compare(A a, A b) {
        return b.compareTo(a);
    }
}
