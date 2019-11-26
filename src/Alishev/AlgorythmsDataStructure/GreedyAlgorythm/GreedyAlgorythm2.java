package Alishev.AlgorythmsDataStructure.GreedyAlgorythm;

/**
 * Задача об минимальных остановках на заправку.
 * Расстояние между заправками это массив.
 * Максимальное расстояние машина может проехать на одном полном баке 400 кт
 * Ответ - оптимально 2 остановки на дозаправку
 */
public class GreedyAlgorythm2 {
    public static void main(String[] args) {
        int[] stations = {0, 200, 375, 550, 750, 950}; // остановки с заправкой через каждые указанные километры
        System.out.println(minStops(stations, 400)); // 2
    }

    public static int minStops(int[] stations, int capacity) {
        int result = 0; // тут будем хранить оптимальное колличество остановок
        int currentStop = 0; //где текуще находится машина сейчас

        while (currentStop < stations.length - 1) { // работаем до тех пор пока количество остановок меньше чем индекс последней остановки в пункте назначения
            int nextStop = currentStop; // самая дальняя достижимая заправка. Изначально начинаем как и текущее положение машины

            while (nextStop < stations.length - 1 &&
                    stations[nextStop + 1] - stations[currentStop] <= capacity) { // пытемся доехать до следующей заправке.
                nextStop++; // В итоге будет индекс наиболее дальней но достижимой заправки
            }
            if (currentStop == nextStop) {
                return -1; // метод возвращает -1 если невозможно доехать из точки А в точку Б.
            }
            if (nextStop < stations.length - 1) { // проверяем не доехали ли мы уже до конца
                result++;
            }
            currentStop = nextStop;
        }
        return result;
    }
}
