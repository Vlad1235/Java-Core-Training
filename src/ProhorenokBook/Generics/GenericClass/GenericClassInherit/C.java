package ProhorenokBook.Generics.GenericClass.GenericClassInherit;

public class C <T> extends A<T>  {
    private int x;

    public C(T obj, int x){
        super(obj);
        this.x = x;
    }

    public int getX(){
        return this.x;
    }

    @Override
    public void test(){
        super.test();
        System.out.println("C x = " + this.x);
    }
}
