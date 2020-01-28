package zoo;
public class Gorilla extends Mammal {
        
    public Gorilla() {
        super();
    }
    
    public void throwSomething() { System.out.println("Gorilla has thrown something!"); energyLevel-=5; }
    
    public void eatBananas() { System.out.println("Mmmm.... Bananas"); energyLevel+=10; }
    
    public void climb() { System.out.println("Gorilla has climbed a tree!"); energyLevel-=10; }
    
}
