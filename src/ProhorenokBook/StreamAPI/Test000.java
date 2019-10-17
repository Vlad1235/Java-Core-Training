package ProhorenokBook.StreamAPI;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
ТЕРМИНАЛЬНЫЕ ОПЕРАЦИИ

 Все промежуточные операции выполняются только после вызова терминальной операции. Терминальная операция заверщает работу с потоком.

 Основные методы:
 forEach() - перебирает все элементы потока. При использовании параллельного потока порадок следования не гарантируется
 forEachOrdered() - перебирает все элементы потока. При использовании параллельного потока порадок следования гарантируется
 count() - возвращает количество элементов в потоке
 close() - закрывает поток
 и др




 */
public class Test000 {
    public static void main(String[] args) {
        IntStream.of(1,2,3,4,5)
                .parallel()
                .forEach(n-> System.out.print(n+ " ")); // 3 2 1 5 4
        System.out.println();

        IntStream.of(1,2,3,4,5)
                .parallel()
                .forEachOrdered(n-> System.out.print(n + " ")); //1 2 3 4 5

        System.out.println(IntStream.of(1,2,3,4,5).count()); //5
        System.out.println();

        Stream<Integer> stream = Stream.of(0,1,2,3);
        stream.onClose(()-> System.out.println("Поток закрыт")).close(); //Поток закрыт
    }
}
