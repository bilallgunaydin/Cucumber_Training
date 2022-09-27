@RegressionTest
Feature: Register Test

  Scenario Outline: Create An Account

    Given Navigate to Website
    And click Sign in button
    And type email "<Email>"
    And click on Create an Account button
    And choose title
    And type firstname "<firstname>" and lastname "<lastname>"
    And type password "<password>"
    And type Company "<company>"
    And type address "<address>"
    Examples:
      | Email | firstname | lastname | password | company | address |

      |bilal@gmail.com|Bilal|Günaydın|bilal123  |techno   |asdadsasads|
      |kisi@gmail.com|Kisi|kisssiii|kisi123  |amazon   |asdadsasads|
