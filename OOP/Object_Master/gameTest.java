import heros.*;

public class gameTest {
    public static void main(String[] args) {
        
        heros.Wizard testWizard = new heros.Wizard();
        heros.Ninja testNinja = new heros.Ninja();
        heros.Samurai testSamurai1 = new heros.Samurai();
        heros.Samurai testSamurai2 = new heros.Samurai();
        
        // Wizard tests
        System.out.println("Wizard tests:");
        System.out.println("testWizard stats: ");
        testWizard.displayStats(); // wizard stats
        System.out.println("testWizard attacks testNinja! (Ninja stats below)");
        testWizard.fireball(testNinja); // fireball
        System.out.println("Ninja stats after: ");
        testNinja.displayStats(); // fireball verif
        System.out.println("Wizard heals self (Wizard stats below)");
        testWizard.heal(testWizard); // heal self
        testWizard.displayStats();
        System.out.println(); System.out.println();System.out.println();
        
        // Ninja Tests
        System.out.println("Ninja Tests");
        System.out.println("testNinja stats: ");
        testNinja.displayStats();
        testNinja.runAway();
        System.out.println("testNinja used runAway()");
        testNinja.displayStats();
        System.out.println("testNinja used steal() on Wizard!");
        testNinja.steal(testWizard);
        System.out.println("Wizard stats below:");
        testWizard.displayStats();
        System.out.println(); System.out.println(); System.out.println();
        
        // Samurai Tests
        System.out.println("Samurai Tests:");
        System.out.println("Samurai stats: \n Samurai 1: ");
        testSamurai1.displayStats();
        System.out.println("Samurai 2: ");
        testSamurai2.displayStats();
        System.out.print("testSamurai2.howMany(): ");
        System.out.println(testSamurai2.howMany());
        System.out.println("testSamurai1 deathblows Ninja!");
        testSamurai1.deathBlow(testNinja);
        testNinja.displayStats();
        testSamurai1.displayStats();
        System.out.println("testSamurai1 uses meditate");
        testSamurai1.meditate();
        testSamurai1.displayStats();
    }
}
