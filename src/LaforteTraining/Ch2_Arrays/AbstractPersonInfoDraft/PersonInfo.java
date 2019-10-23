package LaforteTraining.Ch2_Arrays.AbstractPersonInfoDraft;

/**
 * Хранение примитивных типов упрощает примеры, однако не характерно для реальной работы. В реальности хранимые элементы данных
 * состоят из многих полей.
 * Например, в записи работника может хранится фамилия, имя, отчество, возраст,номер соц страхования.
 *
 */
public class PersonInfo {
    private String lastName;
    private String firstName;
    private int age;

    public PersonInfo(String var1, String var2, int var3) {
        this.lastName = var1;
        this.firstName = var2;
        this.age = var3;
    }

    public void displayPerson() {
        System.out.print("   Last name: " + this.lastName);
        System.out.print(", First name: " + this.firstName);
        System.out.println(", Age: " + this.age);
    }

    public String getLast() {
        return this.lastName;
    } // использование как ключа для поиска и вывода информации

    public int getAge() {
        return this.age;
    }

    public String getFirstName() {
        return this.firstName;
    }
}
