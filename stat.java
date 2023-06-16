// public class stat {
//     private int size;

//     public static void main(String args[]) {

//         stat obj = new stat();
//         obj.setSize(20);

//         System.out.println("Size is " + obj.getSize());

//     }

//     public void setSize(int s) {
//         size = s;
//     }

//     public int getSize() {
//         return size;
//     }
// }

class Player {
    static int playerCount;
    private String name;

    public Player(String n) {
        name = n;
        playerCount++;
    }
}

public class stat {
    public static void main(String args[]) {
        System.out.println(Player.playerCount);
        Player one = new Player("Tiger woods");
        System.out.println(Player.playerCount);
    }
}