package Alishev.basicjava.compareObjects;

public class Animal {
    private int id;

    public Animal(int id) {
        this.id = id;
    }

    public boolean equals(Object object) {
        Animal otheranimal = (Animal) object;
        return this.id == otheranimal.id;
    }
}
