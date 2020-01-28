package zoo;

public class Bat extends Mammal {
    public Bat() { super(); this.energyLevel = 300; }

    public void fly() { System.out.println("Bat flies!"); this.energyLevel -= 50; }
    public void eatHuman() { this.energyLevel += 25; }
    public void attackTown() { System.out.println("*Town burning noises*"); this.energyLevel -= 100; }
}
