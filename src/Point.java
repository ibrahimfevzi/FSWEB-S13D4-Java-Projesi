public class Point {

   private int x;
  private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() { //getter
        return x;
    }

    public void setX(int x) { //setter
        this.x = x;
    }

    public int getY() { //getter
        return y;
    }

    public void setY(int y) { //setter
        this.y = y;
    }


    public double distance(){
        return Math.sqrt(Math.pow((0 - this.x), 2) + Math.pow((0 - this.y), 2));
    }

    public double distance(Point p){
        return Math.sqrt(Math.pow((p.getX() - this.x), 2) + Math.pow((p.getY() - this.y), 2));
    }

    public double distance(int a, int b){
        return Math.sqrt(Math.pow((a - this.x), 2) + Math.pow((b - this.y), 2));
    }
}