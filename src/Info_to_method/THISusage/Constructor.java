package Info_to_method.THISusage;
/*
* ОБЛАСТИ ВИДИМОСТИ!!!
* */
public class Constructor {

    private int count;

    private int method1(){
        int count =1;
        this.count = 2;
        return this.count;
    }

    private int method2(){
         count = 4;
         return count;
    }



    public static void main(String[] args) {
        Constructor constructor = new Constructor();
        int y = constructor.method1();
        int z = constructor.method2();
        System.out.println(y);
        System.out.println(z);
        System.out.println(y);
    }
}
/*
2
4
2
* */