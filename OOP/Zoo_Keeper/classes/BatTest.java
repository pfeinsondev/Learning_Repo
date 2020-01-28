import zoo.Bat;

public class BatTest {
    public static void main(String[] args) {
        Bat test = new Bat();
        for (int i = 0; i < 3; ++i) { test.attackTown(); }
        test.eatHuman(); test.eatHuman();
        test.fly(); test.fly();
        test.displayEnergy();
    }
}
