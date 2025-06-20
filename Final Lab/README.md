# Final Lab Project: Advanced Swing Calculator

## Description
This project implements a full-featured graphical calculator application using Java Swing. Beyond standard arithmetic operations, this calculator includes advanced functions like square root, power, and percentage. A key highlight of this project is its unique ability to display dynamic background GIFs based on specific numeric results or inputs, adding an interactive and personalized touch to the user experience. It also provides a history of calculations and supports keyboard input.

## Technologies Used
* **Java Swing:** The primary toolkit for building the entire graphical user interface, including frames, panels, text fields, text areas, buttons, and layout management (`BorderLayout`, `GridBagLayout`).
* **Java AWT (`java.awt.*`, `java.awt.event.*`):** Underlying framework for graphics, event handling (`ActionListener`, `KeyListener`), and basic UI components.

## Features
* **Standard Arithmetic Operations:** Supports addition (+), subtraction (-), multiplication (*), division (/), and modulo (%).
* **Advanced Mathematical Functions:** Includes square root (R) and power (^) operations.
* **Calculation History:** Displays a running history of performed calculations in a dedicated area.
* **Numeric and Operator Buttons:** A comprehensive set of buttons for all operations and digits, styled for clarity.
* **Keyboard Input Support:** Allows users to input numbers and perform operations directly from their keyboard.
* **Dynamic Background GIFs:** A unique feature that changes the calculator's background image (GIF) based on specific numerical values displayed in the main output field. This provides a playful and customizable element.
* **Custom Button Styling:** Buttons are visually distinguished with different background colors for numbers/dot and operators.
* **Clear and Delete Functions:** 'C' button to clear all inputs and history, 'DEL' button to delete the last character from the current input.
* **Error Handling:** Basic handling for division by zero (implicitly handled by standard double division behavior, which results in `Infinity` or `NaN`).

## GIF Trigger Values
The calculator includes a predefined set of "trigger" values that, when displayed in the main output, will change the background GIF. These are:
* `"760085"`: `Google.gif`
* `"707"`: `lol.gif`
* `"8008"`: `Boobs.gif`
* `"80085"`: `Boobs.gif`
* `"5318008"`: `Boobs.gif`
* `"288"`: `Bee.gif`
* `"235"`: `Bee.gif`
* `"066"`: `Hello.gif`
* `"0.7734"`: `Hello.gif`

**Note:** For the GIF feature to work, you must place the corresponding `.gif` files (e.g., `Google.gif`, `lol.gif`, `Boobs.gif`, `Bee.gif`, `Hello.gif`) in the same directory as your compiled `.class` files, or provide their full path in the `gifTriggers` HashMap.

## How to Run

1.  **Save the Code:** Save the code as `FinalLabProjectCalculator.java`.
2.  **Prepare GIFs (Optional but recommended):** If you wish to see the dynamic background feature, ensure you have the `.gif` files mentioned in the "GIF Trigger Values" section in the same directory as your `.java` file, or update the `gifTriggers` HashMap with paths to your own `.gif` files.
3.  **Compile:** Open a terminal or command prompt, navigate to the directory where you saved the file, and compile the code:
    ```bash
    javac FinalLabProjectCalculator.java
    ```
4.  **Execute:** Run the compiled GUI application:
    ```bash
    java FinalLabProjectCalculator
    ```
    The calculator window will appear.

## Usage
* **Number Input:** Click the digit buttons or use your keyboard's number keys.
* **Operations:** Click the operator buttons (+, -, \*, /, %, ^, R) or use corresponding keyboard keys (e.g., `/` for division, `*` for multiplication, `q` for square root, `s` for power, `C` for clear, `D` for delete).
* **Equals:** Click the `=` button or press the `Enter` key to compute the result.
* **Clear:** Click the `C` button or press the `c` key to clear the current input, history, and reset the calculator.
* **Delete:** Click the `DEL` button or press the `d` key to remove the last character from the input.
* **History:** View previous calculations in the top text area.
* **Dynamic Backgrounds:** Experiment with inputs that result in the trigger values to see the background GIFs change.