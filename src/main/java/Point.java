import java.awt.Color;
import java.awt.Graphics;

public class Point extends Shape{
    private int x;
    private int y;
private boolean selected= false;

 public Point (){}

 public Point(int x, int y, boolean selected) {
    this.x = x;
    this.y = y;
}
}
