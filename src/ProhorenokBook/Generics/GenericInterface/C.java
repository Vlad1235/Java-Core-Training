package ProhorenokBook.Generics.GenericInterface;

public class C implements ITest1 <Integer> {
    private int obj;

    public C(int obj){
        this.obj = obj;
    }
    public int getObj(){
        return this.obj;
    }
    @Override
    public void test(Integer t){
        System.out.println("C obj = " + this.obj);
        System.out.println("t = " + t);
    }
}
