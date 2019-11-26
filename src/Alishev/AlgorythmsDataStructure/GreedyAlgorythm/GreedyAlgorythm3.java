package Alishev.AlgorythmsDataStructure.GreedyAlgorythm;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Реализация задачи о рюкзаке.
 * С помощью ЖАДНОГО АЛГОРИТМА выяснить как ценность текущего набора с данной важностью объектов
 */
public class GreedyAlgorythm3 {
    public static void main(String[] args) {
        final Item item1 = new Item(4, 20);
        final Item item2 = new Item(3, 18);
        final Item item3 = new Item(2, 14);

        final Item[] items = {item1, item2, item3}; // типо наш рюкзак

        // сортировка сложности O(n*Log(n));
        Arrays.sort(items, Comparator.comparingDouble(Item::valuePerUnitOfWeight).reversed()); //описываем логику сортировки. Компаратор сравнивает вещественные числа. Вызваем метод и будем получать удельную ценность каждого предмета и по этому критерию будем сортировать наши Item"ы и разворачиваем наоборот логику сортировки, то есть от большего к меньшему.
        System.out.println(Arrays.toString(items)); // [{ w2, v:14}, { w3, v:18}, { w4, v:20}]

        final int W = 7; // вместимость рюкзака
        int weightSoFar = 0; // аккумулировать текущий вес
        double valueSoFar = 0; // аккумулировать ценность в рюкаке
        int currentItem = 0; // хранится индекс текущего элемента

        while (currentItem < items.length && weightSoFar != W) { //пока есть предметы которые можем выбрать и пока в рюкзаке накопленный вес не стал равняться общему весу рюкзака
            if (weightSoFar + items[currentItem].getWeight() < W) { // накопленный вес ктр мы уже положили в рюкзак + вес очередного предмета ктр мы кладем туда меньше чем общий вес рюкзака, то мы можем положить очередной предмет ЦЕЛИКОМ
                valueSoFar += items[currentItem].getValue();
                weightSoFar += items[currentItem].getWeight();
            } else {
                // если не можем взять целиком, то берем только часть объекта. Часть его ценности и часть его веса
                valueSoFar += ((W - weightSoFar) / (double) items[currentItem].getWeight()) * items[currentItem].getValue(); // получаем ценность той части, которую положем
                weightSoFar = W; // полный рюкзак
            }
            currentItem++;
        }
        System.out.println("Ценность наилучшего объема: " +valueSoFar); //Ценность наилучшего объема: 42.0
    }
}

class Item {
    private int weight;
    private int value;

    public Item(int weight, int value) {
        this.weight = weight;
        this.value = value;
    }

    public int getWeight() {
        return weight;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "{ w" + weight +
                ", v:" + value +
                '}';
    }

    public double valuePerUnitOfWeight() {
        return value / (double) weight; // так как если два целых делим то и результат будет целое, поэтому нужно один привести к вещественному типу
    }
}


