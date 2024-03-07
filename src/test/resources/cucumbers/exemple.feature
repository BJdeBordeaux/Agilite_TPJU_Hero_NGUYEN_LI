Feature: Is hero get more power when he get a pistol?

  Scenario Outline: Hero doesn't have a pistol
    Given a hero has <power> without a pistol
    When he has no pistol
    Then he should  have <power> power
    Examples:
      | power |
      | 100 |
      | 200 |
      | 300 |
