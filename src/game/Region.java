package game;

/* Regions are sets of tiles
 */
public class Region {
	private Tile[] tiles;
	private int numTiles;
	private int defaultTileSize;
	
	public Region(int width, int height) {
		this.defaultTileSize = 32;
		this.tiles = generateTiles(width, height);
	}
	
	// temporary method for tile generation, should have maps
	private Tile[] generateTiles(int width, int height) {
		int tilesWidth = width / defaultTileSize; // total tiles across
		int tilesHeight = height / defaultTileSize; // total tiles vertical
		int tilesTotal = tilesWidth * tilesHeight; // total tiles
		
		Tile[] generatedTiles = new Tile[tilesTotal];
		Sprite tileSet = new Sprite("basicTileSet.png", defaultTileSize, defaultTileSize);
		numTiles = 0;
		for(int i = 0; i < tilesWidth; i++) {
			for(int j = 0; j < tilesHeight; j++) {
				generatedTiles[numTiles] = new Tile(i*defaultTileSize, j*defaultTileSize, defaultTileSize, defaultTileSize, tileSet);
				numTiles++;
			}
		}
		return generatedTiles;
	}
	
	public void draw() {
		for(int i = 0; i < numTiles; i++) {
			tiles[i].draw();
		}
	}
}
