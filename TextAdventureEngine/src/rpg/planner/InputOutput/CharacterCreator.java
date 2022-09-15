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

    private Scanner s;

    public CharacterCreator() {
        this.s = new Scanner(System.in);
    }

    public Character createCharacter() {
        System.out.println("Name:");
        String name = s.nextLine();
        System.out.println("Appearance:");
        String appearance = s.nextLine();
        System.out.println("Background:");
        String background = s.nextLine();
        System.out.println("Strength:");
        String strength = s.nextLine();
        int st = Integer.parseInt(strength);
        System.out.println("Dexterity:");
        String dexterity = s.nextLine();
        int dex = Integer.parseInt(dexterity);
        System.out.println("Intelligence:");
        String intelligence = s.nextLine();
        int in = Integer.parseInt(intelligence);
        System.out.println("Health:");
        String health = s.nextLine();
        int hlt = Integer.parseInt(health);
        System.out.println("Speed:");
        String speed = s.nextLine();
        int spd = Integer.parseInt(speed);
        System.out.println("Quirks: (SEPARATED BY " + LIST_SEPARATOR + ")");
        List<String> quirks = getStringList();
        System.out.println("Skills: (SEPARATED BY " + LIST_SEPARATOR + ")");
        List<String> skills = getStringList();

        return new Character(name, appearance, background, null, null, st, dex, in, hlt, spd);
    }

    private String getInfo(String requestMessage) {
        System.out.println(requestMessage);
        String input = s.nextLine().trim();
        if (input.equalsIgnoreCase(ABORT_COMMAND)) {
            throw new IllegalArgumentException("Character creation aborted.");
        } else if (input.equalsIgnoreCase(HELP_COMMAND)) {
            System.out.println(HELP);
        } else if (input.equalsIgnoreCase(OPTIONS_COMMAND)) {

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
