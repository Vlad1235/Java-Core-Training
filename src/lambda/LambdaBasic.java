package lambda;

public class LambdaBasic {
    public static void main(String[] args) {
        // создание анонимного класса
        ForLambda forLambda = new ForLambda() {
            @Override
            public int sum(int a, int b) {
                return a+b;
            }
        };

        // реализация черезд лямбда
        ForLambda forLambda2 = (a, b) -> a+b;
    }

}

// функциольнальный интерфейс должен иметь лишь ордин метод
@FunctionalInterface
interface ForLambda {
    int sum(int a, int b);
}
