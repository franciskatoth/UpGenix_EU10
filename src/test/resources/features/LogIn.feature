
Feature: User should be able to login

	#AC1-Users can log in with valid credentials (We have 5 types of users but will test only 2 user: PosManager, SalesManager)

	@UPGNX10-228
	Scenario: Verify Users can log in with valid credentials
		When User in on log in page
		Then User enters "salesmanager15@info.com" address
		And user enter "salesmanager"
		Then user clicks on the log in button
		Then user should be on the homepage



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


	#AC2- "Wrong login/password" message should be displayed for invalid credentials (valid username-invalid password and invalid username-valid password)
	@UPGNX10-233
	Scenario: Verify "Wrong login/password" message should be displayed for invalid credentials
		Given  user is on the login page
		When User enters "salesmanager1@info.com" and "salesmanager"
		And User press login button
		Then user sees Wrong login/password message displayed
		And user is on the login page
		Then User enters "salesmaanager15@info.com" and "invalid password"
		And User press login button
		Then user sees Wrong login/password message displayed




	Scenario Template: User should see the "Wrong login/password" message displayed
		Given  user is on the login page
		When User enters "<invalid E-mail>" and "<valid password>"
		And User press login button
		Then user sees Wrong login/password message displayed
		And user is on the login page
		Then User enters "<valid E-mail>" and "<invalid password>"
		And User press login button
		Then user sees Wrong login/password message displayed


		@credentials
		Examples: Credentials
			| invalid E-mail         | valid password | valid E-mail            | invalid password |
			| salesmanager4@info.com | salesmanager   | salesmanager15@info.com | potato1          |
			| salesmanager3@info.com | salesmanager   | salesmanager15@info.com | potato2          |
			| salesmanager2@info.com | salesmanager   | salesmanager15@info.com | potato3          |
			| posmanager1@info.com   | posmanager     | salesmanager15@info.com | potato4          |
			| posmanager2@info.com   | posmanager     | salesmanager15@info.com | potato5          |


		#AC3- "Please fill out this field" message should be displayed if the password or username is empty
	@UPGNX10-236
	Scenario: Verify - "Please fill out this field" message should be displayed if the password or username is empty
		Given  user is on the login page
		When username input box is empty
		And user enter "salesmanager"
		And User press login button
		Then user see Please fill out this field message should be displayed if the password or username is empty




			#AC4- User should see the password in bullet signs by default while typing (like ****)
	@UPGNX10-238 @wip
	Scenario: User should see the password in bullet signs by default while typing (like ****)
		Given user is on the login page
		When user enters "salesmanager15@info.com"
		And user enters password "salesmanager"
		Then user should see bullet signs by default



















