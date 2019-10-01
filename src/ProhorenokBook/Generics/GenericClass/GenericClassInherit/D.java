package ProhorenokBook.Generics.GenericClass.GenericClassInherit;

public class D extends C<Integer> {
    private int y;

    public D(Integer obj, int x, int y){
        super(obj,x);
        this.y = y;
    }
    public int getY(){
        return this.y;
    }
    @Override
    public void test(){
        super.test();
        System.out.println("D y = " + this.y);
    }
}
