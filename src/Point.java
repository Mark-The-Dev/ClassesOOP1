public class Point {
    private int x;
    private int y;

    public Point() {
        this(0,0);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(){

        double newX = (double) this.x;
        double newY = (double) this.y;

        return Math.sqrt((0 - newX) * (0 - newX) + (0 - newY) * ( 0 - newY));

    }
    public double distance(int x, int y){

        double newX = (double) this.x;
        double newY = (double) this.y;
        double newX2 = (double) x;
        double newY2 = (double) y;

        return Math.sqrt((newX2 - newX) * (newX2 - newX) + (newY2 - newY) * ( newY2 - newY));

    }
    public double distance(Point sec){

        double newX = (double) this.x;
        double newY = (double) this.y;
        double newX2 = (double) sec.x;
        double newY2 = (double) sec.y;

        return Math.sqrt((newX2 - newX) * (newX2 - newX) + (newY2 - newY) * ( newY2 - newY));

    }
}
