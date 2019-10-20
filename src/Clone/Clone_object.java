package Clone;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 */
public class Clone_object {

    public static void func1(GregorianCalendar d){
        d = new GregorianCalendar(2018, Calendar.APRIL,24); //Присваивание значения внутри метода лишь изменит количество ссылок на объект, но не сам объект
    }
    public static void func2(GregorianCalendar d){
        d.set(2018,Calendar.APRIL,24); // тут уже изменит, так как вызывается сам объект
    }


    public static void main(String[] args) {
        GregorianCalendar d = new GregorianCalendar();
        System.out.printf("%tc\n",d); //
        func1(d);
        System.out.printf("%tc\n",d);
        func2(d);
        System.out.printf("%tc\n",d); // тут изменилось!! это плохо!
    }
}
/*
Wed Aug 21 04:10:53 JST 2019
Wed Aug 21 04:10:53 JST 2019
Tue Apr 24 04:10:53 JST 2018
 */