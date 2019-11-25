package Alishev.basicjava;

/**
 * Java для начинающих. Урок 21: Ключевое слово static.
 *
 * Главная мысль:
 * переменные и методы объекта
 * переменные и методы класса - помечаются static. Будет общая для всех членов класса
 */
public class Lesson21 {
    public static void main(String[] args) {
        HumanGeneral h1 = new HumanGeneral("Bob", 40);
        HumanGeneral h2 = new HumanGeneral("Nick", 45);
        HumanGeneral h3 = new HumanGeneral("Bob", 40);
        HumanGeneral.description = "Nice"; // для всех одна и та же
        h1.getAllFields();
        h2.getAllFields();
        h3.getAllFields();
        h1.printpeoplecount();
        h2.printpeoplecount();
        h3.printpeoplecount();
    }
}
class HumanGeneral{
    private String name;
    private int age;
    protected static String description; //переменная класса
    private static int countOfPeople; // одна на все объекты


    public HumanGeneral(String name, int age) {
        this.name = name;
        this.age = age;
        countOfPeople +=1;
    }

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

    public void getAllFields(){
        System.out.println(name + "," + age + "," + description);
    }
    public void printpeoplecount(){
        System.out.println(countOfPeople);
    }
}
/*
Bob,40,Nice
Nick,45,Nice
Bob,40,Nice
3
3
3
 */