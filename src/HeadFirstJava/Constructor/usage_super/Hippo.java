package HeadFirstJava.Constructor.usage_super;

public class Hippo extends Animal {

    public Hippo(String name) { // примимает имя
        super(name); // передает его для записи в родительском конструкторе Animal
    }
}
