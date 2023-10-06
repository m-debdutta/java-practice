class Pikachu extends Pokemon {
  Pikachu() {
    super("Pikachu", PokemonType.ELECTRIC, 150, 42);
  }

  Pikachu(int hp) {
    super("Pikachu", PokemonType.ELECTRIC, hp, 42);
  }

  void attack(Pokemon opponent) {
    opponent.takeDamage(20);
  }
}