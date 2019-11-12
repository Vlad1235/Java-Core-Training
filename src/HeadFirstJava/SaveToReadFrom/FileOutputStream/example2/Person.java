package HeadFirstJava.SaveToReadFrom.FileOutputStream.example2;

import java.io.Serializable;

public class Person implements Serializable {
    private String lastName;
    private String firstName;
    transient private int age; // пометили чтобы она не сохранялась, точнее она обнулится и при восстановлении заново присвоится, но уже значением по умолчанию
    private transient Profession profession;// пометили чтобы она не сохранялась, так как класс Profession не реализует интерфейс Serializable. Иначе выдаст обработанное исключение "В структуре сохранения есть несереализуемый класс"

    public Person(String last, String first, int a, String prof) {
        lastName = last;
        firstName = first;
        age = a;
        this.profession = new Profession(prof);
    }

    public void displayPerson() {
        System.out.print("   Last name: " + lastName);
        System.out.print(", First name: " + firstName);
        System.out.print(", Age: " + age);
        System.out.println(", Profession: "+ getProfession());
    }

    public String getLast() {
        return lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getProfession() {
        return profession.getEducation();
    }

    public void setProfession(Profession profession) {
        this.profession = profession;
    }
}
