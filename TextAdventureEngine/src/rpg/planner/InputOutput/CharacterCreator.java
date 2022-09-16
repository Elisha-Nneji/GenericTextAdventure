package rpg.planner.InputOutput;

import rpg.planner.world.people.Character;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CharacterCreator {

    private String LIST_REGEX = "(.+)(;.+)*";
    private String LIST_SEPARATOR = ";";
    private String ABORT_COMMAND = "abort";
    private String HELP_COMMAND = "help";
    private String HELP = "HELP    - prints this help-message\n"
                        + "OPTIONS - shows the different options that you can choose from\n"
                        + "ABORT   - aborts the character creation";
    private String OPTIONS_COMMAND = "options";
    private String REQUEST_INPUT_NAME = "Name:";
    private String REQUEST_INPUT_APPEARANCE = "Appearance:";
    private String REQUEST_INPUT_BACKGROUND = "Background:";
    private String REQUEST_INPUT_STRENGTH = "Strength:";
    private String REQUEST_INPUT_DEXTERITY = "Dexterity:";
    private String REQUEST_INPUT_INTELLIGENCE = "Intelligence:";
    private String REQUEST_INPUT_HEALTH = "Health:";
    private String REQUEST_INPUT_SPEED = "Speed:";
    private String REQUEST_INPUT_QUIRKS = "Quirks: (SEPARATED BY " + LIST_SEPARATOR + ")";
    private String REQUEST_INPUT_SKILLS = "Skills: (SEPARATED BY " + LIST_SEPARATOR + ")";

    private Scanner s;
    private enum exceptionalCase {
        ABORT,
        OPTIONS,
        HELP;
    }

    private exceptionalCase excCase;
    private boolean abortGame;

    public CharacterCreator() {
        this.s = new Scanner(System.in);
    }

    public Character createCharacter() throws AbortException {
        String name = getInfo(REQUEST_INPUT_NAME);
        String appearance = getInfo(REQUEST_INPUT_APPEARANCE);
        String background = getInfo(REQUEST_INPUT_BACKGROUND);
        int st = Integer.parseInt(getInfo(REQUEST_INPUT_STRENGTH)); //TODO: options anzeigen
        int dex = Integer.parseInt(getInfo(REQUEST_INPUT_DEXTERITY));
        int in = Integer.parseInt(getInfo(REQUEST_INPUT_INTELLIGENCE));
        int hlt = Integer.parseInt(getInfo(REQUEST_INPUT_HEALTH));
        System.out.println(REQUEST_INPUT_QUIRKS);
        List<String> quirks = getStringList();
        System.out.println(REQUEST_INPUT_SKILLS);
        List<String> skills = getStringList();

        return new Character(name, appearance, background, null, null, st, dex, in, hlt);
    }

    private String getInfo(String requestMessage) throws AbortException {
        System.out.println(requestMessage);
        String input = s.nextLine().trim();
        if (input.equalsIgnoreCase(ABORT_COMMAND)) {
            throw new AbortException();
        } else if (input.equalsIgnoreCase(OPTIONS_COMMAND)) {
            printOptions(requestMessage);
        } else if (input.equalsIgnoreCase(HELP_COMMAND)) {
            System.out.println(HELP);
        }
        return input;
    }

    private void printOptions(String requestedOptions) {
        if (requestedOptions.equals(REQUEST_INPUT_STRENGTH)
            || requestedOptions.equals(REQUEST_INPUT_INTELLIGENCE)
                || requestedOptions.equals(REQUEST_INPUT_DEXTERITY)) {
            System.out.println("Choose a value between 1 and 20");
        } else {
            System.out.println("You have the free choice"); //TODO: QUicks und Skills auflisten
        }
    }



    private List<String> getStringList() {
        boolean listGotten = false;
        String list = "";
        while (!listGotten) {
            list = s.nextLine();
            if (list.matches(LIST_REGEX)) {
                listGotten = true;
            }
        }
        String[] elements = list.split(LIST_SEPARATOR);
        return Arrays.asList(elements);
    }


}
