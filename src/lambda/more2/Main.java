package lambda.more2;

// методы могут возвращать Lambda
public class Main {
    public static void main(String[] args) {
        System.out.println(getOperation('*').getResult(10,5)); // 50
        System.out.println(getOperation('/').getResult(10,5)); // 2
        System.out.println(getOperation('+').getResult(10,5)); // 15
        System.out.println(getOperation('-').getResult(10,5)); // 5
    }

    private static Operation getOperation(char symbol) {
        switch (symbol) {
            case '*':
                return (value1, value2) -> value1 * value2;
            case '/':
                return (value1, value2) -> value1 / value2;
            case '+':
                return (value1, value2) -> value1 + value2;
            case '-':
                return (value1, value2) -> value1 - value2;
            default:
                return (value1, value2) -> 0;
        }
    }
}
