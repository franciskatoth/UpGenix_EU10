Feature: User should see the password in bullet signs by default while typing (like ****)

	#AC4- User should see the password in bullet signs by default while typing (like ****)
	@UPGNX10-238 @wip
	Scenario: Verify User should see the password in bullet signs by default while typing (like ****)
		Scenario: User should see the password in bullet signs by default while typing (like ****)
		    Given user is on the login page
			When user enters "salesmanager15@info.com"
		    And user enters password "salesmanager"
		    Then user should see bullet signs by default