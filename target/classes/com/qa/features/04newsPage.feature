Feature: Validate News Page elements 

	@NewsPage @regression
	Scenario: Validate News Page Elements
	Given user is on News Page
	When user verify page heading
	When user verify all headings on the page
	Then user verify pagination	