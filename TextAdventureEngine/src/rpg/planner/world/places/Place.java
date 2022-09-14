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

    private String identifier;
    private String description;
    private Inventory inventory;

    private ArrayList<Place> places = new ArrayList<Place>();

    public String getIdentifier() {
        return identifier;
    }

    public String getDescription() {
        return description;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public ArrayList<Place> getPlaces() {
        return places;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
