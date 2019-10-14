package ProhorenokBook.Serializable;


import java.io.*;

public class MyClass {
    public static void main(String[] args) throws Exception {
        OutputStream out = null;

        try {
                out = new FileOutputStream("C:"+File.separator+"Users"+ File.separator+"Work"+File.separator+"IdeaProjects"+File.separator+"PolnoyePovtorenie"+File.separator+"src"+File.separator+"ProhorenokBook"+File.separator+"Serializable"+File.separator+"TestSerializable.txt");
                ObjectOutputStream data = new ObjectOutputStream(out);
            Class1 obj1 = new Class1(20);
            Class1 obj2 = new Class1(88);
            data.writeObject(obj1);
            data.writeObject(obj2);
        } finally {
            if(out != null) out.close();
        }

    }
}
