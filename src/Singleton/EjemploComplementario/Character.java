/*
 * Ejemplo sencillo sin mucha utilitadad
 * pero que demuestra el uso de un Singleton
 */

package Singleton.EjemploComplementario;

public class Character {
    private String name;
    private int level;
    private int health;
    private int mana;
    private int damage;

    public Character(String name, int level, int health, int mana, int damage) {
        this.name = name;
        this.level = level;
        this.health = health;
        this.mana = mana;
        this.damage = damage;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

}
