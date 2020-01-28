package zoo;

public class Mammal {
    
    public int energyLevel;
    
    public Mammal() { this.energyLevel = 100; }
    
    public int displayEnergy() { System.out.println("Current Energy Level: " + energyLevel); return energyLevel; }
    
    
    
}
