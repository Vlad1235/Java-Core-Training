package Alishev.basicjava.writetofile.serializable2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
            Person person1 = new Person(1,"Bob");
            Person person2 = new Person(2,"Mike");
            Person[] people = {person1,person2,new Person(3,"Tom")};

        try {

            FileOutputStream fo = new FileOutputStream("C:\\Projects\\MyTraining\\src\\Alishev\\basicjava\\writetofile\\serializable2\\People.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fo);

//            /*
//            Первый способ
//             */
//            oos.writeInt(people.length); // записываем сначала длину массива, и потом согласно указанной длине поочередно
//            for (Person person:people) {
//                oos.writeObject(person);
//            }
            /*
            Второй способ, согласно концепции что массив это такой же объект
             */
            oos.writeObject(people);

            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
