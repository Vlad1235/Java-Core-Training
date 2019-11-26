package Alishev.basicjava.writetofile.sezializableSerialVersion;

import java.io.Serializable;

/**
 Записали изначально один вариант класса Person, но над ним хорошо поработали и он изменился внутри
 serialVersionUID нужен для того, чтобы помечать состояние класса на промежуток времени. Он генерируется автоматически(надо в среде разработки включить) и изменяется если класс изменился от предыдущего, новые поля изменения в имени старых.
 */
public class Person implements Serializable {

    private static final long serialVersionUID = -7306050777374774927L;
    private int id;
    private String personName;
    private int age;
    private byte type;


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
