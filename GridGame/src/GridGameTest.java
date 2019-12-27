public class GridGameTest {
    public static void main(String[] args) {
        Ball b = new Ball();

        int x = b.getX();
        int y = b.getY();

        Player p = new Player("John");

        for (int i=0; i<x; i++) {
            p.moveRight();
            p.incrementMoves();
        }
        for (int j=0; j<y; j++) {
            p.moveUp();
            p.incrementMoves();
        }

        System.out.println(p.getName()+" has taken "+p.getTotalMoves()+" no of moves to reach ("+x+","+y+")");
    }
}
