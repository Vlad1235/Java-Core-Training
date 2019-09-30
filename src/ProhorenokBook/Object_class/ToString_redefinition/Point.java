package ProhorenokBook.Object_class.ToString_redefinition;

public class Point extends Object {
    private int x, y;

    public Point(){
        this(0,0);
        System.out.println("No data");
    }

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString(){
        return "[" + this.x + ", " + this.y + "]";
    }
}
