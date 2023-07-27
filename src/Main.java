public class Main {
    public static void main(String[] args) {

        System.out.println("===================POINT====================");


        Point first = new Point(6, 5);

        Point second = new Point(3, 1);

        System.out.println("distance(0,0)= " + first.distance());

        System.out.println("distance(second)= " + first.distance(second));

        System.out.println("distance(2,2)= " + first.distance(2, 2));

        Point point = new Point(0,0);

        System.out.println("distance()= " + point.distance());

        System.out.println("===================PLAYER====================");

        Player player = new Player("Ibrahim", 100, Player.Weapon.SWORD);

        player.healthRemaining();
        player.loseHealth(10);
        player.loseHealth(80);
        player.restoreHealth(20);
        player.restoreHealth(120);



    }
}