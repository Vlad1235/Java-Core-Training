package debug;

public class Test3 {
    public static void main(String[] args) {
        example3();
    }

    private static void example3() {
        boolean firstAppLaunch = true;
        boolean tableIsNotEmpty = false;
        boolean isConnected = true;

        if (firstAppLaunch && !tableIsNotEmpty && isConnected){
            System.out.println("loading data...");
        } else {
            System.out.println("data loaded.");
        }
    }
}
