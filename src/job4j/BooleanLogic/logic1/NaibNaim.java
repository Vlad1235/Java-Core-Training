package job4j.BooleanLogic.logic1;

public class NaibNaim {
    //Даны 5 чисел (тип int). Вывести вначале наименьшее, а затем наибольшее из данных чисел.
    // РЕШИЛ СВОИМ СПОСОБОМ!!!
    public void naibNaim1() {
        int x = 2434;
        int y = 3233;
        int z = 5421;
        int h = 1124;
        int t = 94142;
        int min = 0;
        int max = 0;

        if(y > x){
            min = x;
            max = y;
        } else {
            min = y;
            max = x;

        } if (max < z) {
            max = z;
            min = max;

        } if (max < h) {
            max = h;
            min = z;

        } if (max < t) {
            max = t;
            min = h;
        }
        System.out.println(max);
        System.out.println(min);
    }

}


