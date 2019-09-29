package HeadFirstJava.getterSetter.getSet1;

public class GoodDogTestDrive {
    //пример использования getter и setter, то есть Инкапсуляция в работе
    public static void main(String[] args) {

        GoodDog one = new GoodDog();
        one.setSize(80);
        GoodDog two = new GoodDog();
        two.setSize(50);

        System.out.println("Первая собака: " + one.getSize());
        System.out.println("Вторая собака: " + two.getSize());

        one.bark();
        two.bark();
    }
}
/*
Первая собака: 80
Вторая собака: 50
Гав Гав!
Вуф Вуф!
 */