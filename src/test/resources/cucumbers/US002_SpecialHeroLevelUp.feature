Feature: US_002 SpecialHero level up
  As a Player,
  I want to be able to level up my special hero's strength,
  So that he can become stronger and more capable.

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

  Scenario: SpecialHero strength cannot increases with negative input
    Given a SpecialHero with strength 120
    When the strength is increased by -20
    Then the system refuses increasing with the message "Cannot Level Down."

