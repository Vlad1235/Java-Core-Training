package ProhorenokBook.Interface.DoubleInheritage;

public interface IRead {
    public String read();

    default void speak(){ // У дефолт метода обязательно должно быть тело!!!
        System.out.println("default method!");
    }
}
