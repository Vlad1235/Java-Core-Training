package ProhorenokBook.Interface.DoubleInheritage;

public class N implements IReadWrite {
    @Override
    public String read(){
        return "строка 4";
    }
    @Override
    public void write(String s){
        System.out.println(s);
    }

    public void speak(){
        System.out.println("Проверка, что default метод работает!!!");
    }
}
