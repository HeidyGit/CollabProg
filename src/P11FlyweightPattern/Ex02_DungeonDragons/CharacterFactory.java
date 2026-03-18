package P11FlyweightPattern.Ex02_DungeonDragons;


import java.util.HashMap;
import java.util.Map;

public class CharacterFactory {
    private static final Map<String, Character> caracters = new HashMap<>();

    public static Character getCharacter (String race, String eyes, String skincolor, String haircolor){
        String key = race + eyes + skincolor + haircolor;
        Character concreteCharacter = caracters.get(key);
        if(concreteCharacter == null){
            concreteCharacter = new creature(race, eyes, skincolor, haircolor);
            caracters.put(key, concreteCharacter);
        }

        return concreteCharacter;
    }
}
