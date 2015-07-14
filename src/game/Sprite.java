package game;

import org.newdawn.slick.Image;
import org.newdawn.slick.SpriteSheet;
import org.newdawn.slick.SlickException;

/*
 * Should be used for all images.
 * Needs animation to be added in using slick animation class.
 */
public class Sprite {
	private Image view;
	private SpriteSheet sheet;
	public Sprite(String path, int width, int height) {
		try {
			this.sheet = new SpriteSheet(path, width, height);
		} catch(SlickException e) {
			e.printStackTrace();
		}
		setView(0,0);
	}
	public Sprite(SpriteSheet sheet) {
		this.sheet = sheet;
		setView(0,0);
	}
	public void draw(float x, float y) {
		view.draw(x, y);
	}
	
	public void setView(int stageX, int stageY) {
		this.view = sheet.getSprite(stageX,  stageY);
	}
}
