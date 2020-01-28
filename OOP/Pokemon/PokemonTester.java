public class PokemonTester { 
    public static void main(String[] args) {
        // Create empty pokedex
        Pokedex testPokedex = new Pokedex();
        // Create 4 pokemon (Should be added to pokedex on creation
        testPokedex.addPokemon("Bulbasaur", "Grass", 50);
        testPokedex.addPokemon("Charmander", "Fire", 60);
        testPokedex.addPokemon("Squirtle", "Water", 55);
        testPokedex.addPokemon("Pikachu", "Lightning", 65);
        // Print pokedex contents
        testPokedex.listPokemon();
        // divide screen
        divideAction();
        // Bulbasaur attack pikachu
        testPokedex.getByIndex(3).attackPokemon(testPokedex.getByIndex(0));
        // Print pokedex contents
        testPokedex.listPokemon();
    }
    
    public static void divideAction() {
        System.out.println();
        System.out.println("==================================================");
        System.out.println();
    }
}
