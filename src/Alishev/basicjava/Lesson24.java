package Alishev.basicjava;

/**
 * Java для начинающих. Урок 24: Класс Object и метод toString()
 */
public class Lesson24 {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Porche",5);
        System.out.println(v1); //Alishev.basicjava.Vehicle@6acbcfc0 это уникальный идентификатор этого объекта в куче.
        // Чтобы вызвать именно в том формате строку, в котором мы хотим, мы должны переопределить метод ToString()
    }
}

class Vehicle{
    private String name;
    private int age;

    public Vehicle(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
