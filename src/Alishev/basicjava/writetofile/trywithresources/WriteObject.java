package Alishev.basicjava.writetofile.trywithresources;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
            Person person1 = new Person(1,"Bob");

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Projects\\MyTraining\\src\\Alishev\\basicjava\\writetofile\\trywithresources\\Peoples.bin"))) {
            oos.writeObject(person1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
