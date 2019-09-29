package job4j.BooleanLogic.logic1;

public class SravVivesty {
    //     //Даны 4 числа типа int. Сравнить их и вывести наименьшее на консоль.
    // Добрый день, а как должен выглядеть код 1ой программы, если решать ее с помощью «return» ?
    // Добрый день, например так

    public static void main(String[] args) {

        int a = 2, b=0, c=8, d=0;

        int minValue = min(a,b);
        minValue = min(minValue,c);
        minValue = min(minValue,d);

        System.out.print(minValue);
    }
    private static int min(int x, int y){

        if(x <= y){
            return x;
        }
        else
            return y;
    }
}

