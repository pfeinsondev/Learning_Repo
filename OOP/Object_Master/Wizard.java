package heros;

public class Wizard extends Human{
    public Wizard() { super(); health = 50; intelligence = 8; }
    
    public void heal(Human other) { other.health += intelligence; }
    public void fireball(Human other) { other.health -= intelligence*3; }
}
