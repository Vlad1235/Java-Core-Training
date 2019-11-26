package Alishev.basicjava.writetofile.serializable;

import java.io.*;

/**
 * Главное хранить записываемый и считываемый файл в проекте, тогда если отправим бинарник по почте, то он потом при считывании легко найдется!
    Можно записывать таким образом объекты и пересылать их по интернету. У человека получателя, лишь должен быть класс Person идентично фофрмленный
 */
public class ReadObject {
    public static void main(String[] args) {
        try {
            FileInputStream fi = new FileInputStream("C:\\Projects\\MyTraining\\src\\Alishev\\basicjava\\writetofile\\serializable\\Peope.bin");
            ObjectInputStream ois = new ObjectInputStream(fi);
            Person person1 = (Person) ois.readObject(); // возвращает родителя всех классов класс Object, нужно привидение типов
            Person person2 = (Person) ois.readObject(); // возвращает родителя всех классов класс Object, нужно привидение типов

            System.out.println(person1);
            System.out.println(person2);

            ois.close();
        } catch (IOException e) { // Начиная с Java 7 так можно
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("В Вашем проекте нет класса Person");
        }
    }
}
/*
1,Bob
2,Mike
 */