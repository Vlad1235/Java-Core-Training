package ProhorenokBook.Generics.GenericInterface.normalclass;

/**
 * Если обычный класс реализует интерфейс обощенного типа, неважно всеравно нужно указать тип
 * интерфеса и переопределить его методы в соответсвии с указанным типом
 */
public class C implements Itest<Integer> {
    private int obj;

    public C(int obj) {
        this.obj = obj;
    }

    @Override
    public void test(Integer integer) {
        System.out.println("переопределен");
    }
}
