package ProhorenokBook.StaticVariable.StatManyInOne;

  class Stat1 {
    public static int one;

    public int getFigure(){
        return one;
    }


    public static void main(String[] args) {
        one = 5;
        System.out.println(one);
        Stat1 stat1 = new Stat1();
        System.out.println(stat1.getFigure());
    }

}
