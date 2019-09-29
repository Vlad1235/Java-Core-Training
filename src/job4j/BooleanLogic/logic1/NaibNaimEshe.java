package job4j.BooleanLogic.logic1;

public class NaibNaimEshe {

    public void naibNaimEshe1(){
        int x = 13;
        int y = 12;
        int z = 45;
        int h = 146;
        int t = 457;
        int min;
        int max;



        if(x > y) {
            max = x;
        } else {
            max = y;
        }
        if (max < z) {
            max = z;
        }
        if (max < h) {
            max = h;
        }
        if (max < t) {
            max = t;
        }
        System.out.println(max);


        if(x > y) {
            min = y;
        } else {
            min = x;
        }
        if (min > z) {
            min = z;
        }
        if (min > h) {
            min = h;
        }
        if (min > t) {
            min = t;
        }
        System.out.println(min);

    }
}
