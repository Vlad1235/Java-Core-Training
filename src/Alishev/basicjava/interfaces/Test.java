package Alishev.basicjava.interfaces;

public class Test {
    public static void main(String[] args) {
        Animal animal1 = new Animal(1);
        Person person1 = new Person("Vasya");
        animal1.sleep();
        person1.sayHello();
        animal1.showInfo();
        person1.showInfo();
        Info info1 = new Animal(2);
        Info info2 = new Person("Slava");
        info1.showInfo();
        info2.showInfo();
    }
}
/*
I am sleeping
hello
Id is 1
Name is Vasya
Id is 2
Name is Slava
 */