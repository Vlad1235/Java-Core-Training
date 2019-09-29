package job4j.BooleanLogic.DriverSteve;

public class BolLogic {

    public void go() {
        Driver steve = new Driver();
        System.out.println("Steve wants the trucker job.");

        if (!steve.hasLicense()) {
            System.out.println("Steve need to get licence");
            steve.passExamOn('A');
        }
        if (steve.canDrive('C')) {
            System.out.println("Steve works on truckers!");
        } else if (steve.canDrive('B')) {
            System.out.println("Steve works in taxi.");
        } else {
            System.out.println("Steve doesnt have a job, but ride on motorbike");
        }
    }
}
