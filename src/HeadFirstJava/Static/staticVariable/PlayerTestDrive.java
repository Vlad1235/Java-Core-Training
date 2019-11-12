package HeadFirstJava.Static.staticVariable;

public class PlayerTestDrive {
    public static void main(String[] args) {
        System.out.println(Player.playerCount);
        Player one = new Player("Tyger Woods");
        System.out.println(Player.playerCount);
    }
}
/*
0
1
 */