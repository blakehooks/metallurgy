package game;

/*
 * A relatively abstract class that allows an object to
 * exist in the world.
 */
public class Thing {
	protected float x;
	protected float y;
	
	public Thing() {
		
	}
	
	public float getX() {
		return x;
	}
	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}
	public void setY(float y) {
		this.y = y;
	}
}
