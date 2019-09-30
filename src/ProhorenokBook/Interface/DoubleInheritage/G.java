package ProhorenokBook.Interface.DoubleInheritage;

public class G implements IReadWrite{
    @Override
    public String read(){
        return "строка 4";
    }
    @Override
    public void write(String s){
        System.out.println(s);
    }
}
