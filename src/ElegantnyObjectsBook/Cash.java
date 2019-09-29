package ElegantnyObjectsBook;

public class Cash {
    private int dollars;
    private int cents;
    public Cash( int dlr, int cts){
        this.dollars = dlr;
        this.cents = cts;
    }
    @Override
    public String toString(){
        return String.format("$%d.%d",this.dollars,this.cents);
    }
    public void multiply(int factor){
            this.dollars *= factor;
            this.cents *= factor;
    }
}
