package Alishev.patterns;

public class Sigleton {
    private static Sigleton instance;
    private String value;

    private Sigleton(String value) {
        this.value=value;
    }

    public String getValue() {
        return value;
    }

    public static Sigleton getInstance(String value){
        if (instance==null){
            instance = new Sigleton(value);
        }
        return instance;
    }

}
class Main{
    public static void main(String[] args) {

        Sigleton firstTime = Sigleton.getInstance("first shoot");
        System.out.println(firstTime.getValue());

        Sigleton second= Sigleton.getInstance("second shoot");
        System.out.println(second.getValue());

    }
}
/*
first shoot
first shoot
 */