# My Midterm Lab Exam: IT Ticket Processing System (Console Application)

## Description
This Java console application simulates a basic IT ticket processing system. It allows users to manage service tickets by adding new issues, updating their statuses, viewing all existing tickets, and generating a simple report. The system is menu-driven and interacts with the user through standard input/output.

## Features
* **Add New Ticket:**
    * Prompts for an issue description.
    * Prompts for an urgency level (Low, Medium, or High) with input validation.
    * Automatically sets the initial status to "Pending".
    * Has a maximum capacity of 5 tickets.
* **Update Ticket Status:**
    * Allows selecting a ticket by its number.
    * Prevents updating tickets that are already "Resolved".
    * Prompts for a new status (In Progress or Resolved) with input validation.
* **Show All Tickets:**
    * Lists all recorded tickets with their number, issue description, urgency, and current status.
* **Generate Report:**
    * Provides a summary report showing the total number of tickets, as well as counts for "Pending/In Progress" and "Resolved" tickets.
* **Interactive Menu:** Provides a clear menu for navigating through the system's functionalities.
* **Input Validation:** Includes basic validation for urgency levels and new status inputs.

## How to Run

1.  **Save the Code:** Save the code as `MyMidtermLabExam.java`.
2.  **Compile:** Open a terminal or command prompt, navigate to the directory where you saved the file, and compile the code using the Java compiler:
    ```bash
    javac MyMidtermLabExam.java
    ```
3.  **Execute:** Run the compiled application:
    ```bash
    java MyMidtermLabExam
    ```
    The program's main menu will appear in the console.

## Usage
Upon running the application, you will be presented with a menu. Enter the corresponding number for the action you wish to perform:

1.  **Add Ticket:** Follow the prompts to enter the issue description and select an urgency level.
    * *Note:* The system can hold a maximum of 5 tickets.
2.  **Update Ticket Status:**
    * First, the system will display all current tickets.
    * Enter the number of the ticket you wish to update.
    * Enter the new status (either "In Progress" or "Resolved").
3.  **Show All Tickets:** Displays a list of all tickets currently in the system.
4.  **Generate Report:** Shows a summary of total, pending/in progress, and resolved tickets.
5.  **Exit:** Terminates the program.