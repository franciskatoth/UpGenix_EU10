
Feature: User should be able to login

	#AC1-Users can log in with valid credentials (We have 5 types of users but will test only 2 user: PosManager, SalesManager)

	@UPGNX10-228
	Scenario: Verify Users can log in with valid credentials
		When User in on log in page
		Then User enters "salesmaanager15@info.com" address
		And user enter "salesmanager"
		Then user clicks on the log in button



	Scenario Template: Verify Users can log in with valid credentials
		When User in on log in page
		Then User enters "<emailType>" address
		And user enter "<passwordType>"
		Then user clicks on the log in button

		@salesmanager
	Examples: Sales Manager accounts
		| emailType               | passwordType |
		| salesmanager10@info.com | salesmanager |
		| salesmanager11@info.com | salesmanager |
		| salesmanager12@info.com | salesmanager |

		@postmanager
	Examples: Point of Sales Manager accounts
		| emailType             | passwordType |
		| posmanager20@info.com | posmanager   |
		| posmanager21@info.com | posmanager   |
		| posmanager30@info.com | posmanager   |





