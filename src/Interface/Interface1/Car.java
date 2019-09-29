package Interface.Interface1;

public class Car implements Nameable {
    String carName;

    public String getName() {
        return carName;
    }

    public void setName(String aName) {
        this.carName = aName;
    }
}
