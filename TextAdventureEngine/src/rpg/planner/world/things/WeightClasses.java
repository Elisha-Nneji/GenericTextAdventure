package rpg.planner.world.things;

/**
 * @author onyekachi
 * @version 1.0
 *
 * Different Classes of weight, that describe how heavy things are
 */
public enum WeightClasses {
    /**
     * Things that nearly weigh nothing like feathers or hay etc.
     */
    VERY_LIGHT,

    /**
     * Used for small things like food / things you can easily hold in one hand
     */
    LIGHT,

    /**
     * Things you can hold in one hand like a big book or a broom
     */
    NORMAL,

    /**
     * Things that are heavy to hold in one hand like a steel tool or full water bucket
     */
    HEAVY,

    /**
     * Things normal people can't hold in one hand like a full barrel
     */
    VERY_HEAVY,

    /**
     * Things normal people can't hold alone. Like a solid anvil or a donkey cart
     */
    EXTREMLY_HEAVY,

    /**
     * Things people can't / shouldn't move
     */
    NOT_MOVABLE;
}
