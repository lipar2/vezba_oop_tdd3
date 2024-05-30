
public class Point extends Shape{
   private int x;
   private int y;
   private boolean selected= false;

   public Point(){}

   public Point(int x, int y) {
    this.x = x;
    this.y = y;
}
    public Point (int x, int y, boolean selected){
        this.x=x;
        this.y=y;
        this.selected= selected;
    }
}
