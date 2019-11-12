package HeadFirstJava.SaveToReadFrom.FileOutputStream.example1;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Saving {
    public static void main(String[] args)  {
        Foo foo = new Foo();
        foo.setSetWidth(37);
        foo.setSetHeight(70);
        try {
            FileOutputStream fos = new FileOutputStream("C:\\Users\\Work\\IdeaProjects\\PolnoyePovtorenie\\src\\HeadFirstJava\\SaveToReadFrom\\FileOutputStream\\example1\\foo.ser");
            ObjectOutputStream os = new ObjectOutputStream(fos);
            os.writeObject(foo);
            os.close();
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
