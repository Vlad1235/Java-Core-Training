package ComparePrimitives;

public class Comparison {
    public static void main(String[] args) {
        /**
         * Неважно, что разные типы данных. Компилятор сравнивает биты и просто у ИНТЕГЕР больше нулей. Также можно проверить
         * и две ссылки на один и тотже объект- компилятор также проверит лишь биты ссылок. Однако, если сравнивать объекты
         * то уже надо через метод equals().
         */
        int a = 3;
        byte b = 3;
        if(a==b){
            System.out.println("equal");
        }
        Comparison one = new Comparison();
        Comparison two = new Comparison();
        Comparison three = one;
        if(one==three){
            System.out.println("also equal");
        }
    }
}
