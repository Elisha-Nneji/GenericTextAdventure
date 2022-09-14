package rpg.planner;


import rpg.planner.InputOutput.CharacterCreator;
import rpg.planner.world.people.Character;

public class Main {

    public static void main(String[] args) {

        CharacterCreator creator = new CharacterCreator();
        Character character = creator.createCharacter();
        System.out.println(character.getName());
    }

}