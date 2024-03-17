Feature: Enhancing a SpecialHero with Special Weapons

  As a SpecialHero,
  I want to be able to augment my abilities with special weapons,
  So that I can wield unique powers and strengthen my combat prowess.

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
