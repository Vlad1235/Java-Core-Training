package Alishev.basicjava.compareObjects;

/**
 * ЕСЛИ СРАВНИТЬ САМИ ОБЪЕКТЫ, А НЕ ИХ ССЫЛКИ, КОТОРЫЕ АПРИОРИ БУДУТ РАЗНЫЕ, ТАК КАК ССЫЛАЮТСЯ НА РАЗНЫЕ ЯЧЕЙКИ ПАМЯТИ
 */
public class Test {
    public static void main(String[] args) {
        // animal1 -> {1}
        // animal2 -> {1} ссылки это указатели и неважно что объекты похожи, они хранятся в разных местах памяти, и ссылки на них разные поэтому
        Animal animal1 = new Animal(1);
        Animal animal2 = new Animal(1);
        System.out.println(animal1==animal2); // false таким способом сравниваются биты в ссылках на объекты

        //  если метод equals не переопределен в классе Animal   System.out.println(animal1.equals(animal2)); // false  мы попрежнему сравниваем объекты как ссылки, так как сам метод внутри использует == для сравнения
            System.out.println(animal1.equals(animal2)); // true метод equals переопределен
        System.out.println(animal1.hashCode()); // 1791741888
        System.out.println(animal2.hashCode()); // 1595428806
    }
}
