package Alishev.basicjava.enumuration;

public class TestGoodPractice {
    public static void main(String[] args) {
            Animal animal = Animal.CAT;
            switch (animal){
                case CAT:
                    System.out.println("It's a cat");
                    break;
                case DOG:
                    System.out.println("It's a dog");
                    break;
                case FROG:
                    System.out.println("It's a frog");
                    break;
                default:
                    System.out.println("Not an Animal");
            }
        System.out.println(animal.getTranslation()); // кошка





            Season season = Season.SUMMER;
            switch (season){
                case AUTUMN:
                    System.out.println("It's raining outside");
                    break;
                case SPRING:
                    System.out.println("It's warm outside");
                    break;
                case SUMMER:
                    System.out.println("It's water outside");
                    break;
                case WINTER:
                    System.out.println("It's snow outside");
                    break;
                default:
                    System.out.println("Not a type of season");
            }

        System.out.println(season.getClass()); // экземпляром какого класса является season вызов этого класса.
        System.out.println(season instanceof Enum);
        System.out.println(season instanceof Object);

        Season season2 = Season.WINTER;
        System.out.println(season2.getTemperature()); // -20
        System.out.println(season2); // Season{ WINTER temperature=-20}
        System.out.println(season2.name()); // WINTER специальный метод вызова реального имени объекта как он изначально задекларирован, неважно как переопределен метод toString()

        /*
        метод вызова информации(у нас есть лишь информация о температуре) по указанному пользователем enumУ
         */
        Season seasonAsked = Season.valueOf("SPRING");
        System.out.println(seasonAsked.getTemperature()); // 30
        System.out.println(seasonAsked.toString()); // Season{ SPRING temperature=30}

        /*
        возвращение индекса enum. Места какой по очереди стоит наш запрашиваемый енам
         */
        Season winter = Season.WINTER;
        System.out.println(winter.ordinal()); // 1 стоит 2ой по счету
    }
}
/*
It's a cat
кошка
It's water outside
class Alishev.basicjava.enumuration.Season
true
true
 */