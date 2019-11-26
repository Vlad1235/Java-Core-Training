package Alishev.basicjava.writetofile.serializable2;

import java.io.Serializable;

/**
 * Java для начинающих. Урок 46: Сериализация (часть 2). Сериализация массивов.
 */
public class Person implements Serializable {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return id + "," + name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
