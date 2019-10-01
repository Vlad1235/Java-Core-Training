package ProhorenokBook.Generics.GenericArrays;

public class A <T> implements ITest1 {
    private T obj;

    public A(T obj){
        this.obj = obj;
    }

    public T getN(){
        return this.obj;
    }

    @Override
    public void test1(){
        System.out.println("A obj = " + this.obj);
    }
}
