package rpg.planner.world.places;

import rpg.planner.world.places.map.Terrain;

public class Landscape extends Place {

    private Terrain terrain;

    public Landscape(String identifier, String description, int x, int y) {
        super(identifier, description, x, y);
    }

    public void setTerrain(Terrain terrain) {
        this.terrain = terrain;
    }
}
