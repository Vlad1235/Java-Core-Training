package ProhorenokBook.Object_class.hashCode_redefinition;

import java.util.Objects;

/**
 * Если переопределяется метод equals() то и данный метод обязан быть переопределен, и наоборот.
 */
public class Point {

    private int x, y;

    public Point() {
        this(0, 0);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int hashCode(){
        return Objects.hash(this.x, this.y); // расчитываем сами хэш, если оставим стандарт, то при одинаковых координатах будем получать разный хэш.
    }
}
