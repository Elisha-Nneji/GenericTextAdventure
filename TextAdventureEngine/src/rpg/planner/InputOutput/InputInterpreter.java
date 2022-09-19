package rpg.planner.InputOutput;

import rpg.planner.world.people.Character;

import java.util.Locale;

public class InputInterpreter {

    private static final String LOOK_AROUND_REGEX = "(look around|check surroundings|observe surroundings)";
    private static final String PLACE_TAG = "[PLACE]";
    private static final String THING_TAG = "[THING]";
    private static final String PERSON_TAG = "[PERSON]";
    private static final String PLACE_REGEX = "(\\w+\\s{0,1})+";
    private static final String THING_REGEX = "(\\w+\\s{0,1})+";
    private static final String PERSON_REGEX = "(\\w+\\s{0,1})+";

    private Character playedCharacter;

    public InputInterpreter(Character playedCharacter) {
        this.playedCharacter = playedCharacter;
    }

    public void interpretInput(String inputRaw) {
        String input = inputRaw.toLowerCase(Locale.ROOT);

        for (PossibleAction a : PossibleAction.values()) {
            String possibleInput = replaceTags(a.getInputRegEx());

            if (input.matches(possibleInput)) {
                //playedCharacter.do(a,[THING])
            }
        }
    }

    private String replaceTags(String possibleInput) {
        String returnedString = possibleInput.replace(PLACE_TAG, PLACE_REGEX);
        returnedString = returnedString.replace(THING_TAG, THING_REGEX);
        returnedString = returnedString.replace(PERSON_TAG, PERSON_REGEX);
        return returnedString;
    }


}
