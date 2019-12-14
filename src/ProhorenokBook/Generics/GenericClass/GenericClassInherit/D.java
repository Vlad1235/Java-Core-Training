package ProhorenokBook.Generics.GenericClass.GenericClassInherit;

public class D extends C<Integer> { // ограничение. В этом случае класс D становится обычным.
    private int y;

    public D(Integer obj, int x, int y){ // для передачи параметра выше в конструктор нужно использовать класс обертку
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
