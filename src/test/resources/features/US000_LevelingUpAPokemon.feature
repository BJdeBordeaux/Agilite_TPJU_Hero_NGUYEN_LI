Feature: US_000 Leveling up a Pokemon
  As a Pokemon trainer,
  I want to be able to level up my Pokemon,
  So that it can become stronger and learn more powerful moves.

  Scenario: Pokemon levels up successfully
    Given the Pokemon's level is 5
    When I increase the Pokemon's level by 1
    Then the Pokemon's level should be 6

  Scenario Outline: Leveling up a Pokemon increases its level
    Given a Pokemon named <PokemonName> at level <InitialLevel>
    When the trainer levels up <PokemonName> by <LevelUpAmount>
    Then <PokemonName>'s level should be <ExpectedLevel>

    Examples:
      | PokemonName  | InitialLevel | LevelUpAmount | ExpectedLevel |
      | "Pikachu"    | 1            | 2             | 3             |
      | "Charmander" | 5            | 3             | 8             |
      | "Squirtle"   | 10           | 5             | 15            |