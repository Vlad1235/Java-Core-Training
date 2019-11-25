package Alishev.basicjava.interfaces;

public class Person implements Info {
    public String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public void showInfo() {
        System.out.println("Name is " + this.name);
    }

    public void sayHello() {
        System.out.println("hello");
    }
}
