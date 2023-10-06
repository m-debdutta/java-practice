package pokemon;
import pokemon.enums.PokemonType;

public class Pokemon{
  private int hp;
  private int level;
  private int attackPower;
  private final String name;
  private final PokemonType type;

  public Pokemon(String name, PokemonType type, int hp, int attackPower) {
    this.hp = hp;
    this.level = 0;
    this.type = type;
    this.name = name;
    this.attackPower = attackPower;
  }

  public void takeDamage(int damage) {
    this.hp -= damage;
  }

  public void attack(Pokemon opponent) {
    opponent.takeDamage(10);
  }

  public String toString() {
    return String.format("Pokemon: %1$s \nType: %2$s \nHP: %3$d", this.name, this.type, this.hp);
  }
}