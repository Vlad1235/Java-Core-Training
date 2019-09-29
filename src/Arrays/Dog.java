package Arrays;

public class Dog {
    String name;

    public static void main(String[] args) {

        //создаем объект Dog и получаем к нему доступ
        Dog dog1 = new Dog();
        //dog1.name = "Барт"; если активировать эту строчку, то вместо null будет Барт
        dog1.bark();
        dog1.name = "Барт";

        // создадим массив типа Dog
        Dog [] myDogs = new Dog[3];

        // поместим в него несколько элементов и присвоим им данные объектов Dog
        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = dog1;

        // получаем доступ к объектам Dog с помощью ссылок из массива
        myDogs[0].name = "Фред";
        myDogs[1].name = "Джордж";

        // А какое имя у последней собаки?
        System.out.print("Имя последней собаки - ");
        System.out.println(myDogs[2].name);

        // Теперь перебираем все элементы массива и вызовем для каждого метод bark()
        int x = 0;
        while(x<myDogs.length) {

            myDogs[x].bark();

            x = x+1;
        }
    }

    public void bark() {
        System.out.println(name + " сказал Гав!");
    }

    public void eat() {

    }

    public void chaseCat() {

    }
}

/*
null сказал Гав!
Имя последней собаки - Барт
Фред сказал Гав!
Джордж сказал Гав!
Барт сказал Гав!
 */