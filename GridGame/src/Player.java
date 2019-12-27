public class Player {
    private String name;
    private int totalMoves;

    public Player() {
        name = "Yousuf";
        totalMoves = 0;
        System.out.println(name+" is Playing ");
    }

    public Player(String name) {
        this.name = name;
        totalMoves = 0;
        System.out.println(name+" is Playing");
    }

    public void moveRight() {
        System.out.println(name+" is moving Right");
    }

    public void moveUp() {
        System.out.println(name+" is moving Up");
    }

    public void incrementMoves() {
        totalMoves++;
    }

    public String getName() {
        return name;
    }

    public int getTotalMoves() {
        return totalMoves;
    }
}
