package ObektnoOrientirovanMishlenie.Serializable;

import java.io.Serializable;

public class Person implements Serializable {
    private String name;

    public Person(){}

    public Person(String n){
        System.out.println("Внутри конструктора для Person");
        this.name = n;
    }

    public String getName(){
        return this.name;
    }

}
