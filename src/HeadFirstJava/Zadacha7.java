package HeadFirstJava;

public class Zadacha7 {
    //Супер понимание работы цикла!!!!!!!!!!! Разобраться почему получаются такие числа
    public static void main(String[] args) {
            int x = 0;
            int y = 0;

            while(x<5){
/*
                y=y+2;
                if(y>4){
                    y=y-1;
                }
*/
               if(y<5){
                   x=x+1;
                   if(y<3){
                       x=x-1;
                   }
               }
               y=y+2;

                System.out.print(x+""+ y + " ");
                x=x+1;
            }
    }
}
/*
02 14 25 36 47
 */

/*
02 14 36 48
*/

