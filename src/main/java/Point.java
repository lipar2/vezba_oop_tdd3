
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

    public double distance(int x2, int y2) {
		int dx = x2 - x;
		int dy = y2 - y;
		double d = Math.sqrt(dx * dx + dy * dy);
		return d;
	}

    public boolean contains(int x, int y) {
		return this.distance(x,y)<=2;
	}
 
}
