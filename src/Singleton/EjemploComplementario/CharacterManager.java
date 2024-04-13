package Singleton.EjemploComplementario;

import java.util.List;
import java.util.ArrayList;

public class CharacterManager {
    
    private static CharacterManager instance;
    private List<Character> characters;

    private CharacterManager() {
        characters = new ArrayList<Character>();
    }

    public static CharacterManager getInstance() {
        if (instance == null) {
            instance = new CharacterManager();
        }
        return instance;
    }


    public void addCharacter(Character character) {
        characters.add(character);
    }

    public List<Character> getCharacters() {
        return characters;
    }
}
