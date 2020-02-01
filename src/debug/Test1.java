package debug;

public class Test1 {

    private static void example() {
        String source = "The quick brown fox jumps over lazy dog";
        StringBuilder reversed = new StringBuilder();
        for (int i = source.length() - 1; i > 0; i--) {
            reversed.append(source.charAt(i));
        }
        System.out.println(reversed);
    }

    public static void main(String[] args) {
        example();
    }

}
