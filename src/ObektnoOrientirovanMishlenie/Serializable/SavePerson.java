package ObektnoOrientirovanMishlenie.Serializable;
/**
 * Класс который запишет объект в плоский файл.
 */

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SavePerson implements Serializable {
    public SavePerson() {
        Person person = new Person("Джек Воробей");
        try{
            FileOutputStream fos = new FileOutputStream("Name.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            System.out.println("Записанное имя персоны: ");
            System.out.println(person.getName());
            oos.writeObject(person); // акт сериализации и записи объекта.
            oos.flush();
            oos.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
