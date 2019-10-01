package ProhorenokBook.Generics.GenericInterface;

public class A <T> implements ITest1 <T> {
    private T obj;

    public A(T obj){
        this.obj = obj;
    }

    public T getN(){
        return this.obj;
    }

    @Override
    public void test(T t){
        System.out.println("A obj = " + this.obj);
        System.out.println("t = " + t);
    }
}
