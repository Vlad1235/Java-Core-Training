package HeadFirstJava.String_usage;

public class Test {
    private String string;

    public Test(String string) {
        this.string = string;
    }

    public static void main(String[] args) {
        String obj1 = new String("работа");
        String obj2 = new String("работа");
        String obj3 = obj1;
        System.out.println(obj1==obj2); // false проверяются биты самих ссылок. Они конечно разные
        System.out.println(obj1==obj3); // true скопировали биты одной ссылки в другую
        System.out.println(obj1.equals(obj2)); // true проверяются идентфикаторы самого объекта
    }
}
