package Alishev.basicjava;

import java.util.Scanner;

public class Lesson20 {
    public static void main(String[] args) {
        Humanoid humanoid1 = new Humanoid();
        System.out.println(humanoid1.getAge());
        System.out.println(humanoid1.getName());
        Humanoid humanoid2 = new Humanoid("Bob",20);
        System.out.println(humanoid2.getAge());
        System.out.println(humanoid2.getName());
    }
}
class Humanoid{
    private String name;
     private int age;

    public Humanoid(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите показатели объекта");
        System.out.println("Введите имя: ");
        String typedname = scanner.nextLine();
        this.name = typedname;
        System.out.println("Введите возраст: ");
        int typeage = scanner.nextInt();
        this.age = typeage;
    }

    public Humanoid(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }
}
