# Lab Activity 4: Employee Information System - GUI Version (AWT)

## Description
This project represents a significant evolution of the Employee Information System, transitioning from a console-based application to a graphical user interface (GUI) application. Developed using Java's Abstract Window Toolkit (AWT), this program provides a user-friendly interface for inputting employee details (first name, last name, age, hours worked, and hourly wage). It processes these inputs, performs basic validation, calculates the daily salary, and displays the results directly within the GUI window.

## Technologies Used
* **Java AWT (Abstract Window Toolkit):** Used for creating the graphical user interface components and managing layout.
* **Java `java.awt.event.*`:** For handling user interactions, such as button clicks and window closing events.

## Features
* **Graphical User Interface (GUI):** Provides an interactive window for data entry.
* **Input Fields:** Dedicated text fields for First Name, Last Name, Age, Hours Worked, and Hourly Wage.
* **Submit Button:** Triggers the processing of entered data.
* **Real-time Output:** Displays calculated employee information and validation messages in a dedicated text area within the GUI.
* **Basic Input Validation:**
    * Checks if all name fields are filled.
    * Ensures numeric inputs (age, hours, wage) are non-negative.
* **Error Handling:** Utilizes `try-catch` blocks to gracefully handle invalid numeric inputs (e.g., entering text instead of numbers) and other unexpected errors.
* **Daily Salary Calculation:** Computes the daily salary based on hours worked and hourly wage.
* **Window Management:** Includes functionality to properly close the application window.

## How to Run

1.  **Save the Code:** Save the code as `LabActivity4EmpInfoSystemGUI.java`.
2.  **Compile:** Open a terminal or command prompt, navigate to the directory where you saved the file, and compile the code using the Java compiler:
    ```bash
    javac LabActivity4EmpInfoSystemGUI.java
    ```
3.  **Execute:** Run the compiled GUI application:
    ```bash
    java LabActivity4EmpInfoSystemGUI
    ```
    A new window titled "Lab Activity #4 EmployeeInformationSystemGUI" should appear.

## Usage
1.  **Input Data:** Enter the required employee information into the respective text fields (First Name, Last Name, Age, Hours Worked, Hourly Wage).
2.  **Submit:** Click the "Submit" button.
3.  **View Results:** The calculated daily salary and other employee details will appear in the output text area at the bottom of the window.
4.  **Error Messages:** If invalid data is entered (e.g., text in a number field, negative values, or empty name fields), an appropriate error message will be displayed in the output area.
5.  **Close Window:** Click the 'X' button on the window's title bar to close the application.
