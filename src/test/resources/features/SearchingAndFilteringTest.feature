#class
Feature: Test scenarios for searching and filtering functionality
  #test method
  Scenario Outline: Verify every title contains chosen brand
    Given User is on Index Page
    When User opens Gaming Keyboards Category Page
    And User selects "<brand>"
    Then Every title contains chosen "<brand>"

    Examples:
      | brand   |
      | Corsair |

  Scenario Outline: Verify items prices are in defined range
    Given User is on Index Page
    When User opens Gaming Keyboards Category Page
    And User selects "<brand>"
    And User sets "<minPrice>" and "<maxPrice>"
    Then Items prices are between "<minPrice>" and "<maxPrice>"

    Examples:
      | brand   | minPrice | maxPrice |
      | Corsair | 50       | 250      |

  Scenario Outline: Verify items prices are sorted ascendingly
    Given User is on Index Page
    When User opens Gaming Keyboards Category Page
    And User selects "<brand>"
    And User sorts items by price ascendingly
    Then Items prices are sorted ascendingly

    Examples:
      | brand   |
      | Corsair |
