#class
Feature: Test scenarios for searching and filtering functionality
  #test method
  Scenario Outline: Verify every title contains chosen brand
    Given User is on Index Page
    When User opens Gaming Keyboards Category Page
    And User selects "<brand>" on Gaming Keyboards Category Page
    Then Every title contains chosen "<brand>" on Gaming Keyboards Category Page

    Examples:
      | brand   |
      | Corsair |

  Scenario Outline: Verify items prices are in defined range
    Given User is on Index Page
    When User opens Gaming Keyboards Category Page
    And User selects "<brand>" on Gaming Keyboards Category Page
    And User sets "<minPrice>" and "<maxPrice>" on Gaming Keyboards Category Page
    Then Items prices are between "<minPrice>" and "<maxPrice>" on Gaming Keyboards Category Page

    Examples:
      | brand   | minPrice | maxPrice |
      | Corsair | 50       | 250      |

  Scenario Outline: Verify items prices are sorted ascendingly
    Given User is on Index Page
    When User opens Gaming Keyboards Category Page
    And User selects "<brand>" on Gaming Keyboards Category Page
    And User sorts items by price ascendingly on Gaming Keyboards Category Page
    Then Items prices are sorted ascendingly on Gaming Keyboards Category Page

    Examples:
      | brand   |
      | Corsair |
