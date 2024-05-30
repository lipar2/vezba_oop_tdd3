import java.awt.Graphics;
import java.awt.Color;
public abstract class Shape implements Moveable {

    protected boolean selected;
    public abstract void draw(Graphics g);
	public abstract boolean contains(int x, int y);

	
public Shape() {
	
}
public Shape(boolean selcted) {
	this.selected=selected;
}
public boolean isSelected() {
	return selected;
}
public void setSelectd(boolean selected) {
	this.selected=selected;
}
}
