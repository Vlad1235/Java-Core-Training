package Nasledovanie.Vehicle;

public class Demo{
    public static void main(String args[]){
        Vehicle v = new Car(); // Полиморфизм!
        Car s = new Car();
        v.kmToMiles(10);
        s.kmToMiles(20);
    }
}

/*
Внутри родительского класса/статического метода
Внутри дочернего класса/статического метода
 */