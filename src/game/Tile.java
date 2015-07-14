package game;

/*
 * A single patch in the world.
 * Used for the world creation.
 */
public class Tile extends Thing {
	private Sprite tileSet;
	private int width;
	private int height;
	
	public Tile(float x, float y, int width, int height, Sprite tileSet) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.tileSet = tileSet;
	}
	public void draw() {
		tileSet.draw(x, y);
	}
}
