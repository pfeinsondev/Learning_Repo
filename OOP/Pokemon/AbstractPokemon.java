public abstract class AbstractPokemon implements PokemonInterface {
    public Pokemon createPokemon(String name, int health, String type) { return new Pokemon(name, type, health); }
        
    public String pokemonInfo (Pokemon pokemon) { 
        return String.format("%-8s%-8s%n%-8s%-8s%n%-8s%-8s%n", "Name: ", pokemon.getName(), "Type: ", pokemon.getType(), "Health: ", pokemon.getHealth());
    }
    
}
