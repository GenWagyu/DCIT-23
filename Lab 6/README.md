# Lab Activity 6: Simple To-Do List Application (Swing GUI)

## Description
This project develops a multi-window To-Do List application using Java Swing for its Graphical User Interface (GUI). It allows users to manage tasks by adding new entries, each with a name, description, and status. The main window displays all added tasks in a table format, while a separate form window is used for adding new tasks. This activity demonstrates the creation of interactive, multi-window Swing applications and basic data management within a GUI.

## Technologies Used
* **Java Swing:** The primary GUI toolkit used for all graphical components like frames, panels, labels, text fields, text areas, combo boxes, buttons, and tables.
* **Java AWT (`java.awt.*`, `java.awt.event.*`):** Underlying AWT components and event handling mechanisms are leveraged by Swing.

## Project Structure
This application is organized into three `.java` files, each serving a specific purpose:

1.  **`LabActivitySwingToDoList.java`**:
    * **Role:** The main entry point of the application.
    * **Functionality:** Contains the `main` method which initializes and launches the `ToDoListViewer` on the Event Dispatch Thread (EDT), ensuring proper Swing application startup.

2.  **`ToDoListViewer.java`**:
    * **Role:** Represents the main window of the To-Do List application.
    * **Functionality:**
        * Displays existing tasks in a `JTable`.
        * Provides an "Add Task" button to open the `ToDoListForm` window.
        * Includes a public method (`addTask`) that the `ToDoListForm` calls to add new task data to the table.

3.  **`ToDoListForm.java`**:
    * **Role:** Represents the separate form window for adding new tasks.
    * **Functionality:**
        * Presents input fields for Task Name, Task Description, and a dropdown for Status ("Not Started", "Ongoing", "Completed").
        * Includes a "Save Task" button.
        * Performs basic validation (ensures Task Name and Description are not empty).
        * Upon successful saving, it sends the new task data back to the `ToDoListViewer` to be displayed and then closes itself.

## Features
* **Multi-Window Interface:** Seamless interaction between a main viewer window and a separate task creation form.
* **Task Management:** Ability to add new tasks to the list.
* **Tabular Display:** Tasks are clearly presented in a `JTable` with columns for "Task Name", "Task Description", and "Status".
* **Task Details:** Each task includes a name, a more detailed description, and a customizable status.
* **Dropdown Status Selection:** Utilizes a `JComboBox` for easy selection of task status.
* **Form Validation:** Basic checks to ensure essential task fields are not left blank before saving.
* **GUI Event Handling:** Manages button clicks and window closing events.

## How to Run

1.  **Save the Files:** Ensure all three `.java` files (`LabActivitySwingToDoList.java`, `ToDoListForm.java`, `ToDoListViewer.java`) are saved in the same directory.
2.  **Compile:** Open a terminal or command prompt, navigate to the directory where you saved the files, and compile all of them:
    ```bash
    javac LabActivitySwingToDoList.java ToDoListForm.java ToDoListViewer.java
    ```
3.  **Execute:** Run the main application class:
    ```bash
    java LabActivitySwingToDoList
    ```
    The "To-Do List Viewer" window will appear.

## Usage
1.  **Launch Application:** Run the `LabActivitySwingToDoList` class. The main "To-Do List Viewer" window will open.
2.  **Add a New Task:** Click the "Add Task" button in the main viewer window. This will open the "Add New Task" form.
3.  **Fill Task Details:** In the "Add New Task" form, enter the Task Name, Task Description, and select a Status from the dropdown.
4.  **Save Task:** Click the "Save Task" button.
    * If task name or description are empty, an error message will appear.
    * Otherwise, the task will be added to the table in the main "To-Do List Viewer" window, and the "Add New Task" form will close.
5.  **View Tasks:** All added tasks will be listed in the table of the main viewer window.
6.  **Close Application:** Close the "To-Do List Viewer" window by clicking the 'X' button on its title bar.

**Example Screenshots (Conceptual - you would replace this with actual images of your running GUI):**
* **To-Do List Viewer Window:**
    ```
    [Insert Screenshot of your ToDoListViewer window here, showing the table and "Add Task" button]
    ```
* **Add New Task Form Window:**
    ```
    [Insert Screenshot of your ToDoListForm window here, showing the input fields and "Save Task" button]
    ```

## Notes / Considerations
* **Data Persistence:** Tasks added are not saved permanently. They exist only for the duration of the application's runtime. To persist data, mechanisms like file I/O or databases would be needed.
* **Functionality Scope:** This application focuses on adding and viewing tasks. Features like editing, deleting, or marking tasks as complete directly from the table are not implemented but could be future enhancements.
* **UI/UX:** While functional, the UI is basic. Further improvements could include more advanced layout managers, custom rendering for table cells, or more visually appealing components.
* **Single Instance of Form:** The "Add Task" button logic ensures that only one "Add New Task" form can be opened at a time.