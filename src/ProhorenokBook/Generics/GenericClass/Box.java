package ProhorenokBook.Generics.GenericClass;

/**
 * ЗАПОМНИТЬ!
 * Таким образом мы можем хранить данные лююбого типа, но одновреммено только одного!!!
 * Компилятор контролирует типы и не позволит положить на хранение объект другого типа.
 * @param <T>
 */
public class Box <T> {
    private T obj;

    public Box(T obj){
        this.setObj(obj);
    }

    public T getObj(){
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }
}
