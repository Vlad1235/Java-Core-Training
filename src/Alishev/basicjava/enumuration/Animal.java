package Alishev.basicjava.enumuration;

/**
 * Используется для перечисления каких-то объектов.
 * Конструктор по умолчанию считается private в Enum
 */
public enum Animal {
    DOG("собака"), CAT("кошка"), FROG("лягушка");
    // new DOG("собака"); - эквивалентно

    private String translation;

    Animal(){

    }

    private Animal(String translation){
        this.translation = translation;
    }

    public String getTranslation(){
        return this.translation;
    }
}
