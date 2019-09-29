package HeadFirstJava.Constructor.PeregruzhenyConstructor;

public class Class1 {
    private int x;
    public Class1(){
        this(25);
    }
    public Class1(int x){
        this.x = x;
    }
    public int getX(){
        return this.x;
    }
}
