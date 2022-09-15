package rpg.planner.world.people;

/**
 * @version 1.0
 * @author Elisha
 * Advantages, Disadvantages and other Quirks of a person
 */
public enum Quirk {
    UNPLEASANT_DEMEANOR("Unpleasant demeanor", -10, "Others perceive you as unpleasant."),
    PLEASANT_DEMEANOR("Pleasant demeanor", 10, "Others perceive you as pleasant."),
    AMBIDEXTROUS("Ambidextrous (two-handed)", 10, "Both of your hand are you strong hand."),
    BAD_PHYSICAL_CONDITION("Obese / Bad physical condition", -20, "You are in a bad shape, which influences your physical performance."),
    SKINNY("Skinny", -5, "You weigh less than normal");

    private String identifier;
    private int cpBonus;
    private String description;

    Quirk(String identifier, int cpBonus, String description) {
        this.identifier = identifier;
        this.cpBonus = cpBonus;
        this.description = description;
    }

}
