package ProhorenokBook.Interface.Cloneable_usage;

import java.util.Date;

/**
 * Cloneable следует реализовывать, чтобы можно было правильно создавать копию объекта. Через
 * Использование метода clone() класса Object. Он изначально помечен там как защищенный, поэтому нужно реальизовать
 * интерфейс, чтобы сделать его общедоступным. Сам интерфейс не имеет методов, но через него переопределяется метод.
 *
 * Такое усложнение сделано, чтобы программист понимал что без переопределения через cloneable clone() не подходит так как
 * он создает лишь поверхностную копию объекта ((A)A.clone()), так как не смотрит на свойства объекта клонирования.
 * Без переопределения если объект содержить изменяемые объекты в полях, то будут скопированны лишь ссылки на эти объекты.
 * Это значит любое изменение объекта также отразится на объекте клонирования, что сводит на нет смысл клонирования
 *
 * Мои мысли - клонирование нужно, если необходимо протестить на новый функционал, а уже работающий код ломать не хочется.
 */
public class A implements Cloneable{
    private int x;
    private Date d; // Изменяемый объект

    public A(int x){
        this.x = x;
        this.d = new Date();
    }

    public int getX() {
        return this.x;
    }

    public Date getD() {
        return (Date) this.d.clone(); // Изменяемые объекты возвращать только так
    }
    public void newDate(long time){
        this.d.setTime(time);
    }

    @Override
    public A clone(){
        A obj = null;
        try{
            obj = (A) super.clone(); // переопределяем метод из класса Object
        } catch (CloneNotSupportedException e){
            e.printStackTrace();
            System.exit(1);
        }
        obj.d = (Date) this.d.clone();
        return obj;
    }
}
/*
Mon Sep 30 23:37:20 JST 2019
Mon Sep 30 23:37:20 JST 2019
Mon Sep 30 23:37:20 JST 2019
Thu Jan 01 09:00:01 JST 1970
 */