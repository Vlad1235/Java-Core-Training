package ProhorenokBook.Generics.GenericInterface;

public class B < T, U> implements ITest2<T, U> {
    private T obj;

    public B(T obj){
        this.obj = obj;
    }

    public T getObj(){
        return this.obj;
    }
    @Override
    public void test1(T t){
        System.out.println("t = " + t);
    }
    @Override
    public void test2(U u){
        System.out.println("u = " + u);
    }
}
