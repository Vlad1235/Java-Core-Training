package ProhorenokBook.Interface.privatemethod;

/**
 * Начиная с Java 9 внутри блока интерфейса можно объявить закрытый обычный метод с реализацией! Он будет доступен только внутри методов по умолчанию интерфейса
 */
interface IPrivate {
    default void test(){
        print();
    }

    private void print(){
        System.out.println("Привет, я реализован в интерфейсе!");
    }

}
