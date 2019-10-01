package ProhorenokBook.Collections.List_usage.Example1;

import java.util.ArrayList;
import java.util.List;

/**
 * Если класс создает список, то он должен реализовывать интерфейс List<E>
 *    Если мы указываем в типе данных просто List<>, а не конкретно ArraysList<> то
 *    если впоследствии нас не устроит ArrayList мы сможем без потерь его заменить на другой тип.
 */
public class Example1 {
    public static void main(String[] args) {
        Figure figure1 = new Figure(1);
        Figure figure2 = new Figure(3);
        Figure figure3 = new Figure(5);
        Figure figure4 = new Figure(7);

        List<Integer> arr = new ArrayList<Integer>();
      //  arr = new LinkedList<>(); // Взаимозаменяемые
        arr.add(figure1.getX());
        arr.add(figure2.getX());
        arr.add(figure3.getX());
        arr.add(figure4.getX());
        int y = arr.size();
        System.out.println(y); //4


    }
}
