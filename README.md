# User Login Automation Tests

## Setup

1. Install Java and Maven.
2. Clone the project from the repository.
3. Set up the project in your preferred IDE.
4. Ensure ChromeDriver is installed and set the correct path in LoginStepDefinitions.java.
5. Run `mvn clean test` to execute the tests.

## Test Scenarios

1. Successful login:
   - Enters valid username and password and verifies redirection to the home page.

(Optional) Bonus Tasks:

- Add more scenarios to cover unsuccessful logins, such as invalid password, invalid username, and empty credentials.
- Implement hooks in Cucumber to perform actions before and after each scenario, like opening and closing the browser.
