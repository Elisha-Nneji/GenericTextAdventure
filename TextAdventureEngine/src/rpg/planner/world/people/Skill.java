package rpg.planner.world.people;

import static rpg.planner.world.people.SkillLevel.*;
import static rpg.planner.world.people.SkillType.*;

public enum Skill {
    ACROBATICS("Acrobatics", PHYSICAL, DIFFICULT),
    BOW_SHOOTING("Bow shooting", COORDINATING, AVERAGE),
    BOXING("Boxing", PHYSICAL, AVERAGE),
    CLIMBING("Climbing", COORDINATING, EASY),
    CONCEAL("Hide and conceal", MENTAL, AVERAGE),
    LOCK_PICKING("Lock picking", MENTAL, AVERAGE),
    NAVIGATION("Navigation", MENTAL, AVERAGE),
    OBSERVATION("Observation", MENTAL, AVERAGE),
    PICKPOCKETING("Pickpocketing", COORDINATING, DIFFICULT),
    RIDING("Riding", COORDINATING, AVERAGE),
    SOCIAL_SKILL("Social skill", MENTAL, DIFFICULT),
    SURVIVAL("Survival", MENTAL, DIFFICULT),
    SWIMMING("Swimming", COORDINATING, DIFFICULT);

    String identifier;
    SkillType type;
    SkillLevel level;

    Skill(String identifier, SkillType type, SkillLevel level) {
        this.identifier = identifier;
        this.type = type;
        this.level = level;
    }

}
