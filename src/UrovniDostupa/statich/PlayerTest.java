package UrovniDostupa.statich;

public class PlayerTest {
    public static void main(String[] args) {
        System.out.println(Player.playerCount); // Доступ к статической переменной получают также как и для любой другой статической переменной
        Player one = new Player("Тайгер Вудс");
        System.out.println(Player.playerCount);

    }
}
/*
0
1
 */