package rpg.planner.world.people;

import rpg.planner.world.places.Place;
import rpg.planner.world.things.Inventory;
import rpg.planner.world.things.Thing;

import java.util.ArrayList;

/**
 * @author onyekachi
 * @version 1.0
 *
 * Parent class of a person
 */
public class Character {

    private String name;
    private String appearance;
    private String background;

    private ArrayList<Quirk> quirks = new ArrayList<>();
    private ArrayList<Skill> skills = new ArrayList<>();

    private Inventory inventory = new Inventory();

    private int strength;
    private int dexterity;      //Geschicklichkeit
    private int intelligence;
    private int health;
    private int speed;

    public Character(String name, String appearance, String background, ArrayList<Quirk> quirks,
            ArrayList<Skill> skills, int strength, int dexterity, int intelligence, int health) {
        this.name = name;
        this.appearance = appearance;
        this.background = background;
        this.quirks = quirks;
        this.skills = skills;
        this.strength = strength;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
        this.health = health;
        this.speed = 5;     //TODO: Formel zum berechnen

        this.inventory = new Inventory();
    }

    /**
     * Adds Iteam to the inventory of Character
     * @param iteam Iteam to be added
     */
    public void addIteam(Thing iteam) {
        inventory.add(iteam);
    }

    /**
     * Adds Skill to the List of skill
     * @param skill to be added
     */
    public void addSkill(Skill skill) {
        skills.add(skill);
    }

    /**
     * Adds a Quirk to the Quirks of the Character
     * @param quirk to be added
     */
    public void addQuirk(Quirk quirk) {
        quirks.add(quirk);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAppearance(String appearance) {
        this.appearance = appearance;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public String getName() {
        return this.name;
    }
}
