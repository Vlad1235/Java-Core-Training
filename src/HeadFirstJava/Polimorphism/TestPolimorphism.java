package HeadFirstJava.Polimorphism;
/**
 * Благодаря полиморфизму не придется изменять старый код при добавлении новых дочерних классов.
 */
public class TestPolimorphism {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        Cat cat = new Cat();
        Vet vet = new Vet();
        vet.giveShot(wolf);
        vet.giveShot(cat);
    }
}
/*
yyyyyyyy
Myay
 */