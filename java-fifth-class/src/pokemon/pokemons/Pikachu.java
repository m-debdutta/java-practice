package pokemon.pokemons;

import pokemon.Pokemon;
import pokemon.enums.PokemonType;

public class Pikachu extends Pokemon {
  public Pikachu() {
    super("Pikachu", PokemonType.ELECTRIC, 150, 42);
  }

  public Pikachu(int hp) {
    super("Pikachu", PokemonType.ELECTRIC, hp, 42);
  }

  public void attack(Pokemon opponent) {
    opponent.takeDamage(20);
  }
}