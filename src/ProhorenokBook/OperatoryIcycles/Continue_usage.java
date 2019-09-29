package ProhorenokBook.OperatoryIcycles;

/**
 * Вывести все значения от 0 до 100, исключая значения от 5 до 90.
 */
public class Continue_usage {
    public static void main(String[] args) {
        for(int index = 0; index <= 100; index++){
            if(index>=5&&index<=90) continue; // если в инструкции лишь одна команда, то можно без кавычек.
            System.out.print(index + " ");
        }
    }
}
/*
* 0 1 2 3 4 91 92 93 94 95 96 97 98 99 100
* */