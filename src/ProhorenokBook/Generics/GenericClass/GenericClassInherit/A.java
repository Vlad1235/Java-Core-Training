package ProhorenokBook.Generics.GenericClass.GenericClassInherit;

public class A <T> {
    private T obj;

    public A (T obj){
        this.obj = obj;
    }

    public T getObj(){
        return this.obj;
    }

    public void test(){
        System.out.println("A obj = " + this.obj);
    }

}
