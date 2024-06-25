Feature: computerpage feature


  Scenario: verify User Should Navigate To Computer Page Successfully
    Given I am on homepage
    When I click on computer tab
    Then I should verify computer text


  Scenario: verify User Should Navigate To DeskTop Page Successfully
    Given I am on homepage
    When I click on computern tab
    And I click on desktop tab
    Then I should verify desktops text

  @sanity
  Scenario Outline: verify That User Should Build YouOwnComputer And Add Them To Cart Successfully
    Given I am on homepage
    When I click on computer tab
    And I click on desktop tab
    And click on product name
    And I select "<processor>"
    And I Select RAM "<ram>"
    And I Select HDD "<hdd>"
    And I Select OS "<os>"
    And I Select Software "<software>"
    And I click on add to cart button
    Then I should see product added success message  The product has been added to your shopping cart

    Examples:
      | processor                                       | ram           | hdd               | os                      | software                   |
      | 2.2 GHz Intel Pentium Dual-Core E2200           | 2 GB          | 320 GB            | Vista Home [+$50.00]    | Microsoft Office [+$50.00] |
      | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 4GB [+$20.00] | 400 GB [+$100.00] | Vista Premium [+$60.00] | Acrobat Reader [+$10.00]   |
      | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 8GB [+$60.00] | 320 GB            | Vista Home [+$50.00]     | Total Commander [+$5.00]   |


