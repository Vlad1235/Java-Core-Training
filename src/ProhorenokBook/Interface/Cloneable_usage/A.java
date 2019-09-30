package ProhorenokBook.Interface.Cloneable_usage;

import java.util.Date;

/**
 * Cloneable следует реализовывать, чтобы можно было правильно создавать копию объекта.
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

    public Date getD(){
        return (Date) this.d.clone(); // Изменяемые объекты возвращать только так
    }

    public void newDate(long time){
        this.d.setTime(time);
    }

    @Override
    public A clone(){
        A obj = null;
        try{
            obj = (A) super.clone();
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