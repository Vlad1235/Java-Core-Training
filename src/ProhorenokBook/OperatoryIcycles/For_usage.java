package ProhorenokBook.OperatoryIcycles;

/**
 * Понимание принципа работы цикла.
 */
public class For_usage {
    public static void main(String[] args) {
        int index = 1;
        for(;;){ // априори бесконечный цикл.
            if(index <= 10){
                System.out.print(index + " ");
                index++;
            } else {
                break;
            }
        }
    }
}
/*
1 2 3 4 5 6 7 8 9 10
* */