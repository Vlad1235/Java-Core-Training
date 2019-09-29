package HeadFirstJava.getterSetter.Incapsulation;

public class IntSquare {

   private int square;

   public void setSquare(int value){
       if(value>0) {
           this.square = value;
       } else {
           System.out.println("Проверьте правильность ввода данных");
       }
   }

   public int getSquare(){
       int result = SquareCalculate(this.square);
       return result;
   }


    private int SquareCalculate(int square){
        return square*square;
    }

}
