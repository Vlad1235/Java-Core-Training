package ProhorenokBook.Serializable;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class MyClass2 {
        public static void main(String[]args) throws Exception{

            InputStream in=null;

            try{
                in = new FileInputStream("C:"+File.separator+"Users"+ File.separator+"Work"+File.separator+"IdeaProjects"+File.separator+"PolnoyePovtorenie"+File.separator+"src"+File.separator+"ProhorenokBook"+File.separator+"Serializable"+ File.separator+"TestSerializable.txt");
                ObjectInputStream data = new ObjectInputStream(in);
                Class1 obj3=(Class1)data.readObject();
                Class1 obj4=(Class1)data.readObject();
                System.out.println(obj3.getX());
                System.out.println(obj4.getX());
                }
                finally{
                    if(in!=null)in.close();
                }
        }
}
/* // Успешно!
20
88
 */