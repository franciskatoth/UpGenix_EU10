Feature: Verify "Wrong login/password" message should be displayed for invalid credentials

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
