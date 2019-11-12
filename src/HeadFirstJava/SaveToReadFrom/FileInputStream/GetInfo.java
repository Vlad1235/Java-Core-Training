package HeadFirstJava.SaveToReadFrom.FileInputStream;

import HeadFirstJava.SaveToReadFrom.FileOutputStream.example2.Person;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class GetInfo {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\Work\\IdeaProjects\\PolnoyePovtorenie\\src\\HeadFirstJava\\SaveToReadFrom\\FileOutputStream\\example2\\NameList.txt");
            ObjectInputStream os = new ObjectInputStream(fis);
            Object one = os.readObject();
            Object two = os.readObject();
            Object three = os.readObject();
            Person George = (Person) one;
            Person Debora = (Person) two;
            Person Kate = (Person) three;
            os.close();

            Debora.displayPerson();
            George.displayPerson();
            Kate.displayPerson();

        } catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
