package Interface.Interface1;

public class Dog implements Nameable {
    String dogName;

    public String getName(){
        return dogName;
    }
    public void setName(String aName){
        this.dogName = aName;
    }
}
