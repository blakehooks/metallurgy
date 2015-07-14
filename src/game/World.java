package game;
/*
 * Worlds are scenes for the game.
 * Regions are tiled areas the world is made of
 */
public class World {
	private Region[] regions;
	private int numRegions;
	public World(String name, int width, int height) {
		// creates default region
		regions = new Region[1];
		regions[0] = new Region(width, height);
		numRegions++;
	}
	
	public void draw() {
		for(int i = 0; i < numRegions; i++) {
			regions[i].draw();
		}
	}
}
