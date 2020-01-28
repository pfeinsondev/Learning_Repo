package heros;

public class Ninja extends Human{
    public Ninja() { super(); stealth = 10; }
    public void steal(Human other) { other.health -= stealth; health += stealth; }
    public void runAway() { health -= 10; }
    
}
