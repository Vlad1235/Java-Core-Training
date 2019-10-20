package HeadFirstJava.Static;

public class Car {

        String model;
        int maxSpeed;

        public Car(String model, int maxSpeed) { //коснтруктор
            this.model = model;
            this.maxSpeed = maxSpeed;
        }

        public static void main(String[] args) {
            Car bugatti = new Car("Bugatti Veyron", 407); //тут мы передаем переменные на конструктор
            System.out.println(bugatti.model);
            System.out.println(bugatti.maxSpeed);
        }

}
// почитать статью!


/*
Bugatti Veyron
407
*/
