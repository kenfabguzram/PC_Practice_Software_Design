package Tests;
import Singleton.EjemploComplementario.Character;
import Singleton.EjemploComplementario.CharacterManager;

public class CharacterSingletonTest {
    
    public static void main(String[] args) {
        CharacterManager manager = CharacterManager.getInstance();
        Character character1 = new Character("Character 1", 1, 100, 100, 10);
        Character character2 = new Character("Character 2", 1, 100, 100, 10);
        Character character3 = new Character("Character 3", 1, 100, 100, 10);
        manager.addCharacter(character1);
        manager.addCharacter(character2);
        manager.addCharacter(character3);
        for (Character character : manager.getCharacters()) {
            System.out.println("Name: " + character.getName());
            System.out.println("Level: " + character.getLevel());
            System.out.println("Health: " + character.getHealth());
            System.out.println("Mana: " + character.getMana());
            System.out.println("Damage: " + character.getDamage());
            System.out.println();
        }
        CharacterManager manager2 = CharacterManager.getInstance();

        String isEqual = (manager == manager2) ? "Singleton works" : "Singleton doesn't work";
        System.out.println(isEqual);
    }
    
}
