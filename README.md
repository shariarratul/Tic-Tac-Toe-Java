# Tic-Tac-Toe in Java

A simple console-based Tic-Tac-Toe game implemented in Java. Two players take turns marking X or O on a 3x3 grid, aiming to align three symbols horizontally, vertically, or diagonally. The game includes input validation, win/tie detection, and cross-platform console clearing.

## Features
- Two-player gameplay (X vs. O).
- Input validation for row/column moves (1-3).
- Automatic detection of wins or ties.
- Cross-platform console clearing using `ProcessBuilder`.
- Simple and intuitive console interface.

## How to Run
1. Ensure Java (JDK 8 or higher) is installed.
2. Clone the repository:
   ```bash
   git clone https://github.com/shariarratul/Tic-Tac-Toe-Java.git
   ```
3. Navigate to the project directory and compile the Java file:
   ```bash
   javac main.java
   ```
4. Run the game:
   ```bash
   java main
   ```

## Gameplay
- Players alternate turns, entering row and column numbers (1-3).
- The game displays the updated board after each move.
- The game ends when a player wins or the board is full (tie).

