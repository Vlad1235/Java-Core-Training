package ProhorenokBook.Generics.GenericMethods;

public class A implements ITest {
    private int x = 20;
    @Override
    public void print(){
        System.out.println("X = " + this.x);
    }
}
