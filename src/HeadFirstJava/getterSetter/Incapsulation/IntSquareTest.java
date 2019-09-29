package HeadFirstJava.getterSetter.Incapsulation;


public class IntSquareTest {

    int value = -1;

    public static void main(String[] args) {
        IntSquareTest intSquareTest = new IntSquareTest();
        IntSquare intSquare = new IntSquare();
        intSquareTest.value = -1;
        intSquare.setSquare(intSquareTest.value-1);
        int result = intSquare.getSquare();
        System.out.println(result);
    }

}
/*
9
 */