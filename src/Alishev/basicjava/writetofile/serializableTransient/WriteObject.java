package Alishev.basicjava.writetofile.serializableTransient;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
            Person person1 = new Person(1,"Bob");

        try {
            FileOutputStream fo = new FileOutputStream("C:\\Projects\\MyTraining\\src\\Alishev\\basicjava\\writetofile\\serializableTransient\\Peoples.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fo);

            oos.writeObject(person1);

            oos.close(); // обязательно закрыть поток!
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
