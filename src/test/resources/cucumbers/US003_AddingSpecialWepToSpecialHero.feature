Feature: Enhancing a SpecialHero with Special Weapons
  As a Player,
  I want to be able to add special weapons to special hero,
  So that he can have multiple weapons to attack with.

  Scenario Outline: Adding a special weapon to a SpecialHero
    Given a SpecialHero named <SpecialHeroName>
    And a Pokemon special weapon <WeaponName> at level <WeaponLevel>
    When I add the Pokemon special weapon <WeaponName> to <SpecialHeroName>
    Then <SpecialHeroName> should have the Pokemon special weapon <WeaponName>

    Examples:
      | SpecialHeroName  | WeaponName  | WeaponLevel |
      | "Superman"       | "Pikachu"   | 50          |
      | "Batman"         | "Charizard" | 45          |
      | "Wonder Woman"   | "Bulbasaur" | 60          |

  Scenario: SpecialHero strength cannot increases with negative input
    Given a SpecialHero named "Spiderman"
    And a Pokemon special weapon "Pikachu" at level -30
    When I add the Pokemon special weapon "Pikachu" to "Spiderman"
    Then the system refuses adding with the message "Cannot add negative level Pokemon."