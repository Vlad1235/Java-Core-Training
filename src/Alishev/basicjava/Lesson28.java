package Alishev.basicjava;

import Alishev.basicjava.Packet1.Person; // импорт пакета где класс лежит

public class Lesson28 extends Person {  // класс может быть либо default либо public. Смысла в закрытом классе, который виден лишь в рамках этого же класса нет.
    int id;
    private String look = looking; // переменная обозначена в родительском классе как protected. Мы имеем к ней доступ в дочерних классах, неважно где бы они ни были.

    public static void main(String[] args) {
        // public - во всем проекте доступ
        // private - лишь в этом классе
        // default(доступно в пределах этого пакета),
        // protected(доступно в пределах одного пакета, НО и также в подклассах(наследуюмых), даже если эти подклассы вне этого пакета)

        Person person1 = new Person();
    //    person1.name = "Bob"; //мы находимся в другом пакете, и не имеем доступ к данному полю, так как в самом классе она объявлена default

    }
}
