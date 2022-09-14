package rpg.planner.world.places.map;

import rpg.planner.world.places.Place;

public class Map {

    private static final Terrain STANDARD_TERRAIN = Terrain.FOREST;

    private int width;
    private int height;

    private Terrain[][] terrainMap;
    private Place[][] placeMap;


    public Map(int width, int height) {
        this.width = width;
        this.height = height;

        terrainMap = new Terrain[width][height];
        placeMap = new Place[width][height];

        for(int x = 0; x < width; x++) {

            for (int y = 0; y < height; y++) {
                terrainMap[x][y] = STANDARD_TERRAIN;
            }
        }
    }

    public void addPlace(Place place, int x, int y) {
        placeMap[x][y] = place;
    }

    public void changeTerrain(Terrain terrain, int x, int y) {
        terrainMap[x][y] = terrain;
    }

    public Terrain getTerrain(int x, int y) {
        return terrainMap[x][y];
    }

    public Place getPlace(int x, int y) {
        return placeMap[x][y];
    }

    public void printPlace(int x, int y) {
        if (placeMap[x][y] != null) {
            Place place = getPlace(x,y);
            System.out.println(place.getIdentifier() + ": " + place.getDescription()
                    + "\n" + getTerrain(x,y));
        } else {
            System.out.println(getTerrain(x,y));
        }
    }
}
