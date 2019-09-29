package HeadFirstJava.Collections.LinkedList;

public class Mountain {
    String name;
    int height;

    Mountain(String n, int h){
        this.name = n;
        this.height = h;
    }

    public String toString(){
        return name + " " + height;
    }
}
