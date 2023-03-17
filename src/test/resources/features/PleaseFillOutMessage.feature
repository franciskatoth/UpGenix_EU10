Feature: "Please fill out this field" message should be displayed if the password or username is empty

	#AC3- "Please fill out this field" message should be displayed if the password or username is empty
	@UPGNX10-236
	Scenario: Verify - "Please fill out this field" message should be displayed if the password or username is empty
		Given  user is on the login page
			When User enters "salesmanager5@info.com"
			And User press login button
			Then user see Please fill out this field message should be displayed if the password or username is empty