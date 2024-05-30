import java.awt.Color;
import java.awt.Graphics;

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

    public String TOString (){
        return "("+this.x+","+this.y+")"; 
    }

    public boolean equals(Object obj) {

		if (obj instanceof Point) {
			Point p = (Point) obj;

			if (p.x == this.x && p.y == this.y)

				return true;

			else

				return false;

		} else {

			return false;

		}

	}

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean GetSelected(){
        return this.selected;
    }


    @Override
    public void draw(Graphics g) {
            g.setColor(Color.BLACK);
             // Crtanje linije
           g.drawLine(x - 2, y, x + 2, y);
           g.drawLine(x, y - 2, x, y + 2);
             // Ako je tacka selektovana, postavi boju na plavu
             if (selected==true) {
                g.setColor(Color.BLUE);
                // Crtanje pravougaonika oko tacke
               g.drawRect(x - 2, y - 2, 4, 4);
            }
    }

    
 
}
