package Info_to_method.Object_class;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Использование метода clone() если нужно избежать изменения внутри метода, то есть создать копию объекта.
 */
public class Clone_usage {

    public static void func(GregorianCalendar d){
        d.set(2018, Calendar.APRIL,24);
    }

    public static void main(String[] args) {
        GregorianCalendar d = new GregorianCalendar();
        System.out.printf("%tc\n",d); // одинаково
        func((GregorianCalendar)d.clone()); // передаем КОПИЮ. Метод класса Object поэтому нужно приведение типов.
        System.out.printf("%tc\n",d);// одинаково
    }
}
/*
Wed Aug 21 04:19:18 JST 2019
Wed Aug 21 04:19:18 JST 2019
 */