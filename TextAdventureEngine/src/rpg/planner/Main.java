package rpg.planner;

import rpg.planner.InputOutput.AbortException;
import rpg.planner.InputOutput.CharacterCreator;
import rpg.planner.world.people.Character;

public class Main {

    public static void main(String[] args) {
        CharacterCreator creator = new CharacterCreator();
        try {
            Character character = creator.createCharacter();
        } catch (AbortException e) {
            System.out.println("Character creation aborted");
        }
    }

}