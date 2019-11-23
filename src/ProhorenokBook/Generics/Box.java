package ProhorenokBook.Generics;

/**
 * Создаем шаблон класса, который может принимать ЛЮБОЙ ТИП ОБЪЕКТА
 */
public class Box {
    private Object obj;

    public Box(Object obj){
        this.setObj(obj);
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }
}
