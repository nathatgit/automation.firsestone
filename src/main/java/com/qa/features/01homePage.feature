Feature: Validate firestone Homepage elements inculding header and footer. 

	@home_Page @regression
	Scenario: Validate Home Page with header and footer.
	Given  user is on homePage Url
	When user validate header elements
	Then user validate page elements
	Then user validate to footer links
	
	@sanity @headers
	Scenario: Verify Headers elements
	Given user is on homePage Url
	When user validate header elements

 	@sanity @footers
	Scenario: Verify Footer links and URL
	Given user is on homePage Url
	When user validate to footer links
	
	
	
	
	
	
	
	