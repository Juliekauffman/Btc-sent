Feature: Test Sample App

  Scenario: Preencher formulários e verificar envio com sucesso
    Given I am on the vehicle data form page
    When I fill the vehicle data form
    And I press next
    When I fill the insurant data form
    And I press next
    When I fill the product data form
    And I press next
    When I select a price option
    And I press next
    When I fill the send quote form
    And I press send
    Then I should see "Sending e-mail success!"
