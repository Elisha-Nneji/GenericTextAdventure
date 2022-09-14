package rpg.planner.world.things;

import java.util.ArrayList;

public class Inventory {

    private ArrayList<Thing> inventory = new ArrayList<>();

    public void add(Thing iteam) {
        inventory.add(iteam);
    }

}
