package ProhorenokBook.OperatoryIcycles;

public class Switch_usage {
    public static void main(String[] args) {
        Color color = Color.BLACK;
        switch (color){
            case RED:
                System.out.println("RED");
                break;
            case BLUE:
                System.out.println("BLUE");
                break;
            case BLACK:
                System.out.println("BLACK");
                break;
            case WHITE:
                System.out.println("WHITE");
                break;
            default:
                System.out.println("Choice inccorrect");
        }
    }
}
enum Color {RED, BLUE, BLACK, WHITE}
