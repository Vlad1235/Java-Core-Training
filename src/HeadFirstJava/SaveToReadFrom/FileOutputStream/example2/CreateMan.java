package HeadFirstJava.SaveToReadFrom.FileOutputStream.example2;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectOutputStream;

public class CreateMan {
    public static void main(String[] args) {
        Person George = new Person("McTavish","George",27,"Engineer");
        Person Debora = new Person("Grill","Debora",28,"Teacher");
        Person Kate = new Person("Mall","Kate",25,"Nurse");

        George.displayPerson();
        Debora.displayPerson();
        Kate.displayPerson();

        try {
            FileOutputStream fos = new FileOutputStream("C:\\Users\\Work\\IdeaProjects\\PolnoyePovtorenie\\src\\HeadFirstJava\\SaveToReadFrom\\FileOutputStream\\example2\\NameList.txt");
            ObjectOutputStream os = new ObjectOutputStream(fos);
            os.writeObject(George);
            os.writeObject(Debora);
            os.writeObject(Kate);
            os.close();
        }catch (NotSerializableException ex){
            System.out.println("В структуре сохранения есть несереализуемый класс");
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
