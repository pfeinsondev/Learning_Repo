import java.util.*;

public class Pokedex extends AbstractPokemon {
    private LinkedList<Pokemon> myPokemon;
    
    public Pokedex() { myPokemon = new LinkedList<Pokemon>(); }
    
    public void addPokemon(String name, String type, int health) { myPokemon.add(createPokemon(name, health, type)); }
    
    public void listPokemon() { 
        for (Pokemon current: myPokemon) { System.out.println(pokemonInfo(current)); }
    }
    
    public Pokemon findPokemon(Pokemon target) {
        try {
            for (Pokemon current: myPokemon) { if (current.equals(target)) return target; }
        } catch (Exception e) { System.out.println("Pokemon not found!"); }
        return null;
    }
    
    public Pokemon getByIndex(int index) { return myPokemon.get(index); }
    public void processAttack(Pokemon target) { Pokemon agent = findPokemon(target); agent.attackPokemon(target); }
}
