package Alishev.basicjava.writetofile.serializableTransient;

import java.io.Serializable;

/**
 Java для начинающих. Урок 47: Сериализация (часть 3). Transient, serialVersionUID.

 */
public class Person implements Serializable {
    private static final long serialVersionUID = -2743012942344820586L; //
    private transient int id; // при восстановлении поле по умолчанию инициализироваться нулем
    private String name; // если поле будет transient то по умолчанию инициализировалось бы как null


    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return id + ":" + name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
