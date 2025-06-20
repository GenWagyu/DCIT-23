# Lab Activity 2: Employee Information System - Part 2

## Description
This program is an enhanced version of the Employee Information System. Building upon the previous activity, it now collects more comprehensive employee data and performs a wider range of salary calculations. The system takes an employee's personal details (name, age) and work details (hours worked, hourly wage) as input. It then calculates and displays their daily, weekly, monthly, gross yearly, and net yearly salaries, along with a countdown to their retirement based on an assumed retirement age of 65.

## Features
* **Comprehensive Data Input:** Collects employee's first name, last name, age, hours worked per day, and hourly wage.
* **Formatted Full Name:** Displays the full name in "LAST NAME, FIRST NAME" format, converted to uppercase.
* **Retirement Countdown:** Calculates the years remaining until the employee reaches 65 years of age.
* **Multi-tiered Salary Calculation:**
    * Daily Salary
    * Weekly Salary (assuming 5 working days)
    * Monthly Salary (assuming 4 weeks per month)
    * Gross Yearly Salary
    * Taxes Calculation (12% of Gross Yearly Salary + 1500 fixed amount)
    * Net Yearly Salary
* **Formatted Output:** Presents all calculated information in a clear, formatted layout using `printf`.

## How to Run

1.  **Save the Code:** Save the code as `LabActivity2EmployeeInformationSystemPart2.java`.
2.  **Compile:** Open a terminal or command prompt, navigate to the directory where you saved the file, and compile the code using the Java compiler:
    ```bash
    javac LabActivity2EmployeeInformationSystemPart2.java
    ```
3.  **Execute:** Run the compiled program:
    ```bash
    java LabActivity2EmployeeInformationSystemPart2
    ```

## Usage
Upon running the program, you will be prompted to enter the following information:
* Your first name
* Your last name
* Your age
* Hours worked (per day, e.g., `8.0`)
* Hourly wage (e.g., `25.50`)

After providing all inputs, the program will display a detailed breakdown of the employee's information, including their full name, age, years to retirement, and various salary figures (daily, weekly, monthly, gross yearly, and net yearly).
