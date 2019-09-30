package ProhorenokBook.Interface.Comparable_usage;

public class A implements Comparable<A> {
    private int x;
    public A(int x){
        this.x = x;
    }
    @Override
    public int compareTo(A other){
        if(this.x > other.x) return 1;
        if(this.x < other.x) return -1;
        return 0;
    }
}
