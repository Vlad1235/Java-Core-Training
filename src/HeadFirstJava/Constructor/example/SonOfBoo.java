package HeadFirstJava.Constructor.example;

public class SonOfBoo extends Boo {

    public SonOfBoo(){
        super("Boo");
    }
    public SonOfBoo(int i){
        super("Fred");
    }
    public SonOfBoo(String s){
        super(42); // вызов перегруженного конструктора
    }
    public SonOfBoo(int i,String s){
        super(s,i);
    }

}
