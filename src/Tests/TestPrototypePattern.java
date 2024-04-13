package Tests;
import Prototype.*;

public class TestPrototypePattern {

    public static void main(String[] args) {

        SlimePrototypeCharacter originalCharacter = new SlimePrototypeCharacter("green", "medium", "slimy");
        
        SlimePrototypeCharacter clonedCharacter = originalCharacter.clone();
        
        System.out.println("Probando el personaje clonado:");
        System.out.println("Atributo 1: " + (originalCharacter.getAtributo1().equals(clonedCharacter.getAtributo1()) ? "Aprobado" : "Fallido"));
        System.out.println("Atributo 2: " + (originalCharacter.getAtributo2().equals(clonedCharacter.getAtributo2()) ? "Aprobado" : "Fallido"));
        System.out.println("Atributo 3: " + (originalCharacter.getAtributo3().equals(clonedCharacter.getAtributo3()) ? "Aprobado" : "Fallido"));

        System.out.println("Original y clonado son instancias diferentes: " +
                (originalCharacter != clonedCharacter ? "Aprobado" : "Fallido"));
        
        clonedCharacter.setAtributo1("blue");
        System.out.println("Modificar el clon no afecta al original: " +
                (!originalCharacter.getAtributo1().equals(clonedCharacter.getAtributo1()) ? "Aprobado" : "Fallido"));
        
        Game game = new Game(originalCharacter);
        game.startGame();
        
    }
}
