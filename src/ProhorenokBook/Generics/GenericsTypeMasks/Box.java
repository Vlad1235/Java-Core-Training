package ProhorenokBook.Generics.GenericsTypeMasks;

public class Box <T> {
    private T obj;

    public Box(T obj) {
        this.setObj(obj);
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

}