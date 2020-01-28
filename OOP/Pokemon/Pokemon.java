public class Pokemon {
    private String name, type;
    private int health;
    
    private static int pokemonSpawned = 0;
    
    // Constructors
    public Pokemon() { this("", "", 100); }
    public Pokemon(String name) { this(name, "", 100); }
    public Pokemon(String name, String type) { this(name, type, 100); }
    public Pokemon(String name, String type, int health) { this.name = name; this.type = type; this.health = health; pokemonSpawned++; }
    
    public void setName(String name) { this.name = name; }
    public String getName() { return name; }
    
    public void setType(String type) { this.type = type; }
    public String getType() { return type; }
    
    public void setHealth(int health) { this.health = health; }
    public int getHealth() { return health; }
    
    public int getPokemonSpawned() { return pokemonSpawned; }
    
    public void attackPokemon(Pokemon pokemon) { pokemon.setHealth(pokemon.getHealth()-10); }
    
}
