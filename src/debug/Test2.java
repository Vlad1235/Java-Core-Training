package debug;


import org.w3c.dom.ls.LSOutput;

public class Test2 {

    public static void main(String[] args) {
        example2();
    }

    public static void example2() {
        int value1;
        int value2;
        value1 = randomValue(100);
        value2 = randomValue(100);
        System.out.println(String.format("Two random values: %d, %d", value1, value2));
    }

    private static int currentRandomValue = 377;

    private static int randomValue(int maxValue) {
        currentRandomValue = currentRandomValue * 1103515245 + 12345;
        return Math.abs(currentRandomValue / 65536) % (maxValue + 1);
    }

}
