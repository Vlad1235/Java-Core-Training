package HeadFirstJava.Polimorphism.TestGenerics;

public class TestGenerics1 {
    public static void main(String[] args) {
        new TestGenerics1().go();
    }

    public void go(){
        Animal[] animals = {new Dog(), new Cat(),new Dog(),new Dog(),new Cat()};
        Dog[] dogs = {new Dog(), new Dog(), new Dog()};
        takeAnimals(animals);
        takeAnimals(dogs);
    }

    public void takeAnimals(Animal[] animals){
        for(Animal a: animals){
            a.eat();
        }
    }
}
/*
 animal feed itself
 animal feed itself
 animal feed itself
 animal feed itself
 animal feed itself
 animal feed itself
 animal feed itself
 animal feed itself
 */