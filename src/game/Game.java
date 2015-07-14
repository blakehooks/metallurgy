package game;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

/*
 * @author Kenny Jones
 */
public class Game extends BasicGame {
	private World world;
	private Engineer player;
	
	public Game() {
		super("metallurgy");
	}
	public static void main(String[] args) {
		try {
			AppGameContainer app = new AppGameContainer(new Game());
			app.setDisplayMode(720, 480, false);
			app.start();
		} catch (SlickException e) {
			e.printStackTrace();
		}
	}
	@Override
	public void init(GameContainer container) throws SlickException {
		this.world = new World("base", 1024, 1024);
		this.player = new Engineer(0, 0);
	}
	@Override
	public void update(GameContainer container, int delta) throws SlickException {
		
	}
	public void render(GameContainer container, Graphics g) throws SlickException {
		//g.setAntiAlias(true);
		world.draw();
		player.draw();
	}
}
