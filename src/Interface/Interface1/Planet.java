package Interface.Interface1;

public class Planet implements Nameable {
    String planetName;

    public String getName(){
        return planetName;
    }
    public void setName(String aName){
        this.planetName = aName;
    }
}
