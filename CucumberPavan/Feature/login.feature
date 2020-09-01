Feature: OrangeHRM login

Scenario: Logo Presence on OrangeHRM home page
	Given I luanch chrome browser
	When I open OrangeHRM homepage
	Then I verify that the logo present on page
	And close browser
	