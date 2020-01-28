import heros.Human;

public class HumanTest {
    
    public static void main(String[] args) {
        Human test = new Human();
        test.displayStats();
        Human test2 = new Human();
        test.attackHuman(test2);
        test2.displayStats();
    }
}
