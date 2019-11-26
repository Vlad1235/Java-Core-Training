package Alishev.basicjava.writetofile.serializableTransient;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;


public class ReadObject {
    public static void main(String[] args) {
        try {
            FileInputStream fi = new FileInputStream("C:\\Projects\\MyTraining\\src\\Alishev\\basicjava\\writetofile\\serializableTransient\\Peoples.bin");
            ObjectInputStream ois = new ObjectInputStream(fi);

            Person person1 = (Person) ois.readObject(); // возвращает родителя всех классов класс Object, нужно привидение типов
            System.out.println(person1);

            ois.close();
        } catch (IOException e) { // Начиная с Java 7 так можно
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("В Вашем проекте нет класса Person");
        }
    }
}
/*
1:null
 */