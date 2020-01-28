import zoo.Gorilla;

public class GorillaTest {
    public static void main(String[] args) {
        Gorilla demo = new Gorilla();
        for (int i = 0; i < 3; ++i) { demo.throwSomething(); }
        demo.eatBananas(); demo.eatBananas();
        demo.climb();
        demo.displayEnergy();
    }
}   
