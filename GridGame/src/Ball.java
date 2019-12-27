public class Ball {
    private int x,y;

    public Ball() {
        this.x = (int) (Math.random()*10)+1;
        this.y = (int) (Math.random()*10)+1;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
