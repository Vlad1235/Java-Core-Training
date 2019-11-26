package Alishev.basicjava.enumuration;

/**
 * До использования enum использовался данный способ.
 */

public class Test {
    private static final int DOG = 0;
    private static final int CAT = 1;
    private static final int FROG = 2;

    public static void main(String[] args) {
        int animal = DOG;

        switch (animal){
            case DOG:
                System.out.println("it's a dog");
                break;
            case FROG:
                System.out.println("it's a frog");
                break;
            default:
                System.out.println("It's not an animal");
        }
    }
}
