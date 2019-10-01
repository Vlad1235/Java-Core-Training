package ProhorenokBook.Generics.GenericClass.GenericClassInherit;

public class B <T,U> extends A<T> {
    private U n;

    public B(T obj, U n){
        super(obj);
        this.n = n;
    }

    public U getN(){
        return this.n;
    }

    @Override
    public void test(){
        super.test();
        System.out.println("B n = " + this.n);
    }
}
