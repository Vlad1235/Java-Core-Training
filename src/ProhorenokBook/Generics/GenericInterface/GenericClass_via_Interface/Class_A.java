package ProhorenokBook.Generics.GenericInterface.GenericClass_via_Interface;

public class Class_A implements ITest1,ITest2 {
    @Override
    public void test1(){
        System.out.println("test1()");
    }
    @Override
    public void test2(){
        System.out.println("test2()");
    }
}
