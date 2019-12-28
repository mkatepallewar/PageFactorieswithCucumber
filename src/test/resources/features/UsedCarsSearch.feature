@Used-Search-Cars
Feature: Acceptance testing to validate used search car is working fine.
  In order to validate that
  the used search cars page is working fine
  we will do the accpetance testing.

  @Used-Search-Cars-Positive
  Scenario: Validate used Search Cars Page
    Given I am on the homepage "https://www.carsguide.com.au/" of carsguide website
    When I move to menu
      | Menu          |
      | buy+sell      |
      | review        |
      | news          |
      | advice        |
      | pricing+specs |
      | labs          |
      | guides        |
    And click in "Used" search car link
    And select carbrand as "Audi" from any make dropdown
    And select car model
    	| carModel			|
    	|	A4						|
    	|	A3						|
    And select location as "NSW - All" from selectlocation dropdown
    And select price as "$2,500" from price dropdown
    And click on Find_My_Next_Car button
    Then I should see the list of searched cars
    And the page title should be "Used Audi A4 Under 2500 for Sale NSW | carsguide"
