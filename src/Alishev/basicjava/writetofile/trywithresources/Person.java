package Alishev.basicjava.writetofile.trywithresources;

import java.io.Serializable;

/**
 *
 */
public class Person implements Serializable {

    private static final long serialVersionUID = -7306050777374774927L;
    private int id;
    private String personName;



    public Person(int id, String name) {
        this.id = id;
        this.personName = name;
    }

    @Override
    public String toString() {
        return id + ":" + personName;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return personName;
    }
}
