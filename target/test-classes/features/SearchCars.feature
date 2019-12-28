@Search-Cars
Feature: Acceptance testing to validate search car is working fine.
  In order to validate that
  the search cars page is working fine
  we will do the accpetance testing.

  @Search-Cars-Positive
  Scenario: Validate Search Cars Page
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
    And click on "Search Cars" link
    And select carbrand as "BMW" from any make dropdown
    And select carmodel as "1 Series" from selectmodel dropdown
    And select location as "Any Location" from selectlocation dropdown
    And select price as "$1,000" from price dropdown
    And click on Find_My_Next_Car button
    Then I should see the list of searched cars
    And the page title should be "Bmw 1 Series Under 1000 for Sale | carsguide"
