package HeadFirstJava.Constructor.usage_super;

public abstract class Animal { //использование как закрытый контейнер для хранения значений, с доступом только через метод и конструктор
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
