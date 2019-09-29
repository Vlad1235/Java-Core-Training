package ProhorenokBook.OperatoryIcycles;

/**
 * Использование МЕТКИ для выхода сразу из нескольких циклов.
 */
public class Break_usage2 {
    public static void main(String[] args) {
        int count = 0;
       BLOCK1:
        while(true){ // вечный цикл.
                System.out.println("Начало цикла 1");
                BLOCK2:
                    for(int index = 0; index < 5; index++){
                        System.out.println("---Начало цикла 2");
                        System.out.println("----Внутри цикла 2");
                            if(index ==2){
                                System.out.println(" --- break");
                                break BLOCK1;
                            }
                        System.out.println("----Конец цикла 2");
                    }
                System.out.println("После цикла 2"); // эти инструкции не видны так как сразу выбрасывает к BLOCK1
                count++; // эти инструкции не видны так как сразу выбрасывает к BLOCK1
            System.out.println("Количество раз: " + count); // эти инструкции не видны так как сразу выбрасывает к BLOCK1
            }
        System.out.println("После цикла 1");
    }
}
/*
Начало цикла 1
---Начало цикла 2
----Внутри цикла 2
----Конец цикла 2
---Начало цикла 2
----Внутри цикла 2
----Конец цикла 2
---Начало цикла 2
----Внутри цикла 2
 --- break
После цикла 1
* */