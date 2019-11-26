package Alishev.basicjava.writetofile.trywithresources;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * Такой синтаксис называется TryWithResources. Так как метод ObjectInputStream через InputStream реализует интерфейс Closable, а у него есть лишь один метод close()
 * Таким образом не нужно самостоятельно закрывать поток
 */
public class ReadObject {
    public static void main(String[] args) {
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Projects\\MyTraining\\src\\Alishev\\basicjava\\writetofile\\trywithresources\\Peoples.bin"))) { // этот синтаксик называется tryWithResources
            Person person1 = (Person) ois.readObject(); // возвращает родителя всех классов класс Object, нужно привидение типов
            System.out.println(person1);

        } catch (IOException e) { // Начиная с Java 7 так можно
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("В Вашем проекте нет класса Person");
        }
    }
}
