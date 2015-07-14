package game;

/* Engineers are the main players.
 * They are like trainers from pokemon, but builders of robots.
 */
public class Engineer extends Thing {
	//private Inventory inventory;
	//private Robot[] / RobotCollection robots;
	private Sprite sprite;
	public Engineer(float startX, float startY) {
		this.x = startX;
		this.y = startY;
		this.sprite = new Sprite("larry_sticker.png", 375, 360);
	}
	public void draw() {
		sprite.draw(x, y);
	}
}
