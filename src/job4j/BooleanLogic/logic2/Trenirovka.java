package job4j.BooleanLogic.logic2;

public class Trenirovka {
    String str1 = new String("True");
    boolean b1 = true;
    boolean bool1;

    public void trenSrav(){
        bool1 = Boolean.valueOf(str1);
        if(bool1 == b1){
            System.out.println("Vse poluchilos");
        } else{
            System.out.println("Uchis dalshe!");
        }
    }
}
