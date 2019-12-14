package ProhorenokBook.Generics.GenericClass.GenericClassInherit;

public class B <T,U> extends A<T> { //  родительский класс А имеет обобщенный тип <T>, обязательно указать его и передать в конструкторе
    private U n;

    public B(T obj, U n){
        super(obj); // передаем на обработку в родительский класс
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
