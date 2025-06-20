# Lab Activity 3: Employee Information System - Conditional Statements

## Description
This Java program is an advanced iteration of the Employee Information System, focusing on the implementation of conditional statements (`if-else if-else` and `switch`). Beyond collecting employee details and calculating various salary figures (daily, weekly, monthly, gross yearly, net yearly), this version incorporates robust input validation for age and working hours. It also allows for the assignment of employee roles and implements a progressive tax calculation based on gross yearly income, showcasing the use of conditional logic to control program flow and data processing.

## Features
* **Comprehensive Data Input:** Collects first name, last name, age, hours worked per day, hourly wage, and employee role code.
* **Input Validation:**
    * **Age Check:** Prevents inputs for individuals under 18 or over 65 years old, exiting the program for invalid ages.
    * **Hours Worked Check:** Validates daily working hours to ensure they are within a sensible range (greater than 0 and not exceeding 24).
* **Role Assignment:** Assigns an employee role (Manager, Supervisor, Staff, Intern, or Undefined) based on a numeric code input using a `switch` statement.
* **Full Name Formatting:** Displays the full name in "LAST NAME, FIRST NAME" format, converted to uppercase.
* **Retirement Countdown:** Calculates years remaining until age 65.
* **Multi-tiered Salary Calculation:**
    * Daily, Weekly, Monthly, Gross Yearly Salary.
* **Conditional Tax Calculation:** Implements a progressive tax system where:
    * Gross Yearly Incomes over PHP 250,000 are taxed at 32% plus a fixed PHP 1,500.
    * Gross Yearly Incomes PHP 250,000 or less incur only a fixed PHP 1,500 deduction.
    * Calculates Net Yearly Salary after tax.
* **Formatted Output:** Presents all collected and calculated information in a clear, aligned format using `printf`.

## How to Run

1.  **Save the Code:** Save the code as `LabActivity3ConditionalStatement.java`.
2.  **Compile:** Open a terminal or command prompt, navigate to the directory where you saved the file, and compile the code:
    ```bash
    javac LabActivity3ConditionalStatement.java
    ```
3.  **Execute:** Run the compiled program:
    ```bash
    java LabActivity3ConditionalStatement
    ```

## Usage
Upon running the program, you will be prompted to enter employee information. Pay attention to the validation rules:
* **Age:** Must be between 18 and 65 (inclusive).
* **Hours Worked:** Must be a positive value, not exceeding 24.
* **Role Code:** Enter `1` for Manager, `2` for Supervisor, `3` for Staff, `4` for Intern. Any other number will result in an "Undefined" role.

If invalid inputs are provided for age or hours, the program will display an error message and exit.
