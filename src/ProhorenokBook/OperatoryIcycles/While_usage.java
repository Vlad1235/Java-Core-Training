package ProhorenokBook.OperatoryIcycles;

public class While_usage {
    public static void main(String[] args) {
        int index = 0;
        while (index <= 10){
            System.out.print(index + " ");
            index += 2;
        }
        System.out.println();
        index = 1;
        do {
            System.out.print(index + " ");
            index *= 2;
        } while (index <=10);
    }
}
/*
0 2 4 6 8 10
1 2 4 8
*/