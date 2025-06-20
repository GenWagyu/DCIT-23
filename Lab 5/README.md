# Lab Activity 5: Simple Quiz Application (AWT GUI)

## Description
This Java program implements a basic multiple-choice quiz application with a Graphical User Interface (GUI) built using the Abstract Window Toolkit (AWT). The quiz presents a series of pre-defined questions, each with multiple-choice options. Users select an answer and click "Next" to proceed. Upon completing all questions, the application displays the final score.

## Technologies Used
* **Java AWT (Abstract Window Toolkit):** Utilized for creating all GUI elements like windows, labels, buttons, and checkboxes.
* **Java `java.awt.event.*`:** For handling user interactions, specifically button clicks and window closing events.

## Features
* **Interactive GUI:** Provides a user-friendly window for taking the quiz.
* **Multiple-Choice Format:** Presents questions with four selectable options using `Checkbox` components grouped by `CheckboxGroup` to allow only one selection.
* **Question Navigation:** "Next" button to move between questions.
* **Score Tracking:** Keeps a running tally of correct answers.
* **Answer Validation:** Prompts the user to select an answer if they try to proceed without one.
* **Quiz Completion:** Displays a final score summary once all questions are answered.
* **Window Management:** Includes functionality to properly close the application window.

## Quiz Content (Sample Questions)
The quiz currently includes sample questions covering basic computer knowledge, such as:
* What does CPU stand for?
* Which is a common input device for a computer?
* What is a program or set of programs that tells a computer what to do?

*(You can expand the `questions`, `choices`, and `correctAnswers` arrays in the code to add more questions.)*

## How to Run

1.  **Save the Code:** Save the code as `LabActivity5QuizAppAWT.java`.
2.  **Compile:** Open a terminal or command prompt, navigate to the directory where you saved the file, and compile the code using the Java compiler:
    ```bash
    javac LabActivity5QuizAppAWT.java
    ```
3.  **Execute:** Run the compiled GUI application:
    ```bash
    java LabActivity5QuizAppAWT
    ```
    A new window titled "Lab Activity 5 Quiz App AWT" should appear.

## Usage
1.  **Start Quiz:** The first question will be displayed automatically upon launch.
2.  **Select Answer:** Click on one of the four radio button options corresponding to your chosen answer.
3.  **Next Question:** Click the "Next" button to submit your answer and proceed to the next question.
    * If no answer is selected, a message "Please select an answer." will appear.
4.  **View Results:** After answering all questions, the quiz will display your final score in the question area, and the "Next" button will be disabled.
5.  **Close Window:** Click the 'X' button on the window's title bar to exit the application.

