Feature: Empowering Hero with Pistol

  As a player,
  I want to be able to increase my hero's power when acquiring a pistol,
  So that I can utilize firearms to enhance my capabilities in combat.

  Scenario Outline: Hero doesn't have a pistol
    Given a hero has <power> without a pistol
    When he has no pistol
    Then he should  have <power> power
    Examples:
      | power |
      | 100 |
      | 200 |
      | 300 |
