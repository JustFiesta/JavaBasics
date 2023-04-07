package Labs.no5.Zadanie1;

public class Point {
    int x, y;
    public Point(){
        x = 0;
        y = 0;
    }
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void tare(){
        this.x = 0;
        this.y = 0;
    }
    public void description(String PointName) {
        System.out.println("Dane twojego punktu: " + "x=" + x + ", y=" + y);
    }
    public void move(int moveX, int moveY) {
        this.x += moveX;
        this.y += moveY;
    }

    public String description(){
        return "Klasa Punkt.";
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
}
