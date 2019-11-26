package Alishev.basicjava.writetofile.serializable;

import java.io.Serializable;
/**
Запись и считываение одного объекта
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
