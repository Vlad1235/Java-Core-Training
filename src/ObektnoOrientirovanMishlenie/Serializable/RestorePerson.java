package ObektnoOrientirovanMishlenie.Serializable;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * Класс который восстановит объект из плоского файла.
 */
public class RestorePerson {

    public RestorePerson(){
        try{
            FileInputStream fis = new FileInputStream("Name.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Person person = (Person)ois.readObject(); // извлечение экземпляра класса из файла.
            System.out.println("Восстановленное имя: ");
            System.out.println(person.getName());
            ois.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
