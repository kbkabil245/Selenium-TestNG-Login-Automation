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
```text
Selenium-TestNG-Login-Automation
├── src                                                                                
│ ├── main/java/pages # Page Object Classes (LoginPage, Page_Class)                     
│ ├── test/java/tests # Test Scripts (Tests, BaseTest)
│ └── test/resources # Test Configuration (testng.xml)
├── utils # Helper Classes (Screenshot_Utility)
├── screenshots # Execution Screenshots
├── pom.xml # Maven Dependencies
└── README.md # Project Documentation

## Execution Screenshot
![Login Success](utils/Login%20Success.png)


