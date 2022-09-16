package rpg.planner;

import rpg.planner.world.people.Character;
import rpg.planner.world.people.Quirk;
import rpg.planner.world.people.Skill;
import rpg.planner.world.places.Landscape;
import rpg.planner.world.places.Place;
import rpg.planner.world.places.Village;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /**
        CharacterCreator creator = new CharacterCreator();
        try {
            Character character = creator.createCharacter();
        } catch (AbortException e) {
            System.out.println("Character creation aborted");
        }
        **/

        List<Quirk> quirks = new ArrayList<>();
        quirks.add(Quirk.AMBIDEXTROUS);
        List<Skill> skills = new ArrayList<>();
        skills.add(Skill.OBSERVATION);
        Character amir = new Character("Amir the lion",
                quirks, skills, 9, 11, 13, 30);

        Place spawn = new Landscape("Forest", "beautiful forest", 0, 0);
        amir.setLocation(spawn);




    }


}