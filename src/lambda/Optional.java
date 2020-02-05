package lambda;

@FunctionalInterface
public interface Optional<T> { // обощенный функциональный интерфейс (с Java 8)
    T execute(T value1, T value2);
}
