package Arrays.arrays5;

class TestArrays {

        public static void main(String[] args){

            String[] islands = new String[4];
            int[] index = new int[4];
        // здесь нет присвоение объекта строки, например ta[x] = new Triangle() так
            // как здесь нет ни методов ни переменных, которые надо вызвать из других классов
            islands[0] = "Bermudas";
            islands[1] = "Fidzhi";
            islands[2] = "Ozorsky islands";
            islands[3] = "Kosymel";

            index[0] = 1;
            index[1] = 3;
            index[2] = 0;
            index[3] = 2;

            int y =0;

            int ref;
            while(y<4){
                ref = index[y];
                System.out.println(islands[ref]);
                y = y+1;
            }
        }
}
/*
Fidzhi
Kosymel
Bermudas
Ozorsky islands
 */
