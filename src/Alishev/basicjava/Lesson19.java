package Alishev.basicjava;

/**
 * Java для начинающих. Урок 19: Ключевое слово this.
 */
public class Lesson19 {
    public static void main(String[] args) {
        Human human1 = new Human();
        human1.setAge(18);
        human1.setName("Tom");
        human1.genInfo();

    }
}
class Human{
    String name;
    int age;


    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void genInfo(){
        System.out.println(name + "," + age);
    }

}