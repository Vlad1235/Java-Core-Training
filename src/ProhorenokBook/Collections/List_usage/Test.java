package ProhorenokBook.Collections.List_usage;

/**
 * Интерфейс List<E> реализует классы:
 * ArrayList<E> - динамический список. Быстрый доступ по индексу и быстрый перебор элементов коллекции.Минус это медленная вставка, добавление и удаление, так как требуется время на перемещение.
 * LinkedList<E> - связанный список, элементы хранят ссылки на предыдуший и последующий элементы. Вставка и удаление - быстро, надо лишь изменить ссылки, в отличие от АррауЛиста где нужно перемещать элементы.
 * Vector<E> - синхронизированный динамич список. Похож на ArrayList<E> однако класс Vector<E> явл синхонизированным и может быть использован для доступа из разных потоков. Потери на синхронизацию - минус в скорости чем у ArrayList<E>
 */
public class Test {
}