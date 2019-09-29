package ProhorenokBook.Numbers;

import java.math.BigDecimal;

/**
 * Использовать для вычитания из одного вещественного числа другое! ТОлько так можно вычитать вещественные числа!!!
 */
public class VichitatVeshestvChislo {
    public static void main(String[] args) {
        System.out.println(0.3-0.1-0.1-0.1); // нельзя таким способом работать с вещественными числами.
        BigDecimal x = new BigDecimal("0.3"); // если необходимо производить операции с фиксированной точностью!
        BigDecimal y = new BigDecimal("0.1");
        x = x.subtract(y);
        x = x.subtract(y);
        x = x.subtract(y);
        System.out.println(x);
    }
}
/*
-2.7755575615628914E-17
0.0
*/