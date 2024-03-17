Feature: US_002 SpecialHero level up
  As a SpecialHero,
  I want to be able to level up my strength,
  So that I can become stronger and more capable.

  Scenario: SpecialHero strength increases successfully
    Given a SpecialHero with strength 100
    When the strength is increased by 20
    Then the strength should be 120

  Scenario Outline: Leveling up a SpecialHero increases its strength
    Given a SpecialHero named <SpecialHeroName> with strength <InitialStrength>
    When the <SpecialHeroName>'s strength increases by <StrengthIncrease>
    Then <SpecialHeroName>'s strength should be <ExpectedStrength>

    Examples:
      | SpecialHeroName | InitialStrength | StrengthIncrease | ExpectedStrength |
      | "Legolas"       | 80              | 30               | 110              |
      | "Gandalf"       | 120             | 10               | 130              |
      | "Frodo"         | 50              | 25               | 75               |

