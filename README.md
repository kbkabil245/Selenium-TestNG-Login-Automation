# Selenium-TestNG-Login-Automation
Automation Web Application Login functionality using Selenium WebDriver, Java, and TestNG framework.
## Project Overview
This project automates the **Login Functionality** of a web application to ensure that the authentication process is working correctly. It includes both positive (valid credentials) and negative (invalid credentials) test scenarios.

## Tech Stack & Tools
- **Language:** Java
- **Automation Tool:** Selenium WebDriver
- **Testing Framework:** TestNG
- **Build Tool:** Maven
- **IDE:** Eclipse

## Key Features
- **Annotations:** Used TestNG annotations like `@Test`, `@BeforeMethod`, and `@AfterMethod`.
- **Locators:** Identified web elements using **XPath**, **ID**, and **Name** locators.
- **Reporting:** Basic console reports for pass/fail status.
- **Regression Testing:** Designed to be part of a regression suite for login modules.

## How to Run
1. Clone or Download this repository.
2. Import the project into Eclipse IDE.
3. Right-click on `testng.xml` and select **Run As -> TestNG Suite**.

### Project Structure
```Text
Selenium-TestNG-Login-Automation
├── 📂 Reports
│ ├── README.md
│ └── emailable-report.html # Test Execution Results
├── 📂 src
│ ├── 📂 main/java/pages
│ │ ├── LoginPage.java # Locators & Page Actions
│ │ └── Page_Class.java
│ └── 📂 test
│ ├── 📂 java/tests
│ │ ├── BaseTest.java # Driver Setup & Teardow
│ │ └── Tests.java # Actual Test Scenarios
│ └── 📂 resources
│ └── testng.xml # Test Suite Configuration
├── 📂 utils
│ ├── Login Success.png # Execution Screenshot
│ └── Screenshot_Utility.java # Reusable Utility Code
├── 📄 .gitignore
├── 📄 LICENSE
├── 📄 pom.xml # Maven Dependencies
└── 📄 README.md # Project Documentation

```
## Execution Screenshot
![Login Success](utils/Login%20Success.png)

### Project Layout
Below is the organized structure of this automation framework:

1. **Reports/** - Test execution results and HTML reports for stakeholders.
2. **src/** - Contains all the core Java source code (Pages and Test Scripts).
3. **utils/** - Helper classes for common tasks like taking screenshots.
4. **testng.xml** - Test suite configuration (located in `src/test/resources`).
5. **pom.xml** - Maven configuration file for managing dependencies.
6. **README.md** - Project documentation and setup guide.


