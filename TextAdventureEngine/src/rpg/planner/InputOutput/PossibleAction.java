package rpg.planner.InputOutput;

public enum PossibleAction {
    LOOK_AROUND("look around"),
    WALK_TO("walk to [PLACE]"),
    TALK_TO("(talk to|talk with) [PERSON]"),        //TODO: replaceWith [PERSON] [PLACE] [THING]
    INVESTIGATE("(investigate|search|take a look at) [THING]"),
    INTERACT("(interact|use) [THING]");

    private String inputRegEx;

    PossibleAction(String inputRegEx) {
        this.inputRegEx = inputRegEx;
    }

    public String getInputRegEx() {
        return inputRegEx;
    }
}
