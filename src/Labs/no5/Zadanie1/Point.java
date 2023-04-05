package Labs.no5.Zadanie1;

import static Labs.no5.Main.InputInt;

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
    public String description(String PointName) {
        return "Dane twojego punktu: " +
                "x=" + x +
                ", y=" + y;
    }
    public void move(int moveX, int moveY) {
        System.out.println("O ile chcesz przesunąć x?");
        moveX = InputInt();

        System.out.println("O ile chcesz przesunąć y?");
        moveY = InputInt();

        this.x += moveX;
        this.y += moveY;
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
