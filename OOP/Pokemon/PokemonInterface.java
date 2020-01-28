public interface PokemonInterface {
    static String name = "";
    static String type = "";
    static int health = 0; 
    
    Pokemon createPokemon(String name, int health, String type);
    String pokemonInfo(Pokemon pokemon);
    void listPokemon();
}
