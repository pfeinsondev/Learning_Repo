package heros;

public class Human {
    protected int strength, stealth, intelligence, health;
    
    public Human() { strength = 3; stealth = 3; intelligence = 3; health = 100; }
    
    public void attackHuman(Human other) { other.health -= strength; }
    public void displayStats() { System.out.printf("Health: %5s Strength: %5s intelligence: %5s Stealth: %5s%n", health, strength, intelligence, stealth); }
}
