package lambda;

public class Main {
    public static void main(String[] args) {
    Optional<Integer> additing = (value1, value2) -> value1+value2;
        System.out.println(additing.execute(3,4));
    Optional<String> concatenation = (value1, value2) -> value1+value2;
        System.out.println(concatenation.execute("Hello"," World"));
    }
}
