package rpg.planner.world.places;

import rpg.planner.world.things.Inventory;

import java.util.ArrayList;

/**
 * @author onyekachi
 * @version 1.0
 *
 * Parent class of all places
 */
public class Place {

    private final String identifier;
    private final String description;
    private final int x;
    private final int y;
    private Inventory inventory;

    public Place(String identifier, String description, int x, int y) {
        this.x = x;
        this.y = y;
        this.identifier = identifier;
        this.description = description;
    }

    public String getIdentifier() {
        return identifier;
    }

    public String getDescription() {
        return description;
    }
}
