package heros;

public class Samurai extends Human{
    private static int samuraiCount;
    
    public Samurai() { super(); health = 200; samuraiCount++; }
    
    public void deathBlow(Human other) { other.health = 0; health /= 2; }
    public void meditate() { health *= 1.5; }
    public int howMany() { return samuraiCount; }
}
