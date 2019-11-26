package Alishev.basicjava.innerclass;

public class Electrocar3 {
    private int id;

    public static class Battery{
        public void charge(){
            System.out.println("Battery is charging...");
        }
    }
    public Electrocar3(int id) {
        this.id = id;
    }
/*
имеет доступ и к нестатическим полям и к константам метода
    ТОЛЬКО КОНСТАНТЫ МЕТОДА МОГУТ РАБОТАТЬ с КЛАССОМ внутри метода
    Зачем создавать внутри метода вложенный класс - похоже на анонимный класс.
 */
    public void start(){
        final int x=1;

        class SomeClass{
            public void someMethod(){
                System.out.println(x);
                System.out.println(id);
            }
        }
        SomeClass someClass = new SomeClass();
        test(someClass);

        System.out.println("Electrocar3" + id + "is starting..");
    }
    private void test(Object object){
    }
}
