Feature: Validate About US Page elements 

	@aboutUS @regression
	Scenario: Validate AboutUS Page Elements
	Given user is on About Us Page
	When user verify tabs links on the page
	Then user verify headings present on the page	