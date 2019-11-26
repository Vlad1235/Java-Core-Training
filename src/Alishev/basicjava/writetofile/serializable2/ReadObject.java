package Alishev.basicjava.writetofile.serializable2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;


public class ReadObject {
    public static void main(String[] args) {
        try {
            FileInputStream fi = new FileInputStream("C:\\Projects\\MyTraining\\src\\Alishev\\basicjava\\writetofile\\serializable2\\People.bin");
            ObjectInputStream ois = new ObjectInputStream(fi);

//            /*
//            первый способ
//             */
//            int personCount = ois.readInt();
//            Person[] people = new Person[personCount];
//            for (int i=0;i<personCount;i++){
//                people[i] = (Person) ois.readObject();
//            }

            /*
            Второй способ
             */
            Person[] people = (Person[]) ois.readObject();

            System.out.println(Arrays.toString(people)); // считываем в массив

            ois.close();
        } catch (IOException e) { // Начиная с Java 7 так можно
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("В Вашем проекте нет класса Person");
        }
    }
}
/*
[1,Bob, 2,Mike, 3,Tom]
 */