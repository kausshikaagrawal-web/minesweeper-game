# Minesweeper Game 

This project is a console-based implementation of the classic **Minesweeper** game,
developed using Java. The program simulates a grid-based arena where bombs are
randomly placed, and the player interacts with the grid through text input.

## Program Overview
The game begins by allowing the user to define the size of the arena (rows and columns)
and the number of bombs to be placed. Bombs are distributed randomly across the grid.
Each non-bomb cell stores the count of bombs in its neighboring cells.

The player can perform different actions such as:
- Playing a cell to reveal its value
- Placing a flag to mark a suspected bomb
- Marking a cell as doubtful

The game ends if the player reveals a bomb or successfully completes the grid.

## Features
- Dynamic grid creation using 2D arrays
- Random bomb placement
- Automatic calculation of neighboring bomb counts
- Menu-driven gameplay
- Flag (`@`) and doubt (`?`) marking system
- Point-based scoring mechanism
- Console display of the game board

## Scoring System
- Correct flag on a bomb: +25 points  
- Incorrect flag: −25 points  
- Correct doubt marking: +10 points  
- Incorrect doubt marking: −10 points  

The total score is displayed at the end of the game.

## Technologies Used
- Java
- 2D Arrays
- Scanner and DataInputStream for input handling
- Math.random() for bomb placement

## How to Run
1. Clone or download the repository
2. Open the file in a Java-compatible IDE or terminal
3. Compile the program:javac mine.java
4. Run the program:java mine

## Purpose
This project was developed for academic practice to strengthen understanding of:
- Two-dimensional arrays
- Conditional logic
- Looping constructs
- Game logic implementation in Java

## Author
Kausshika Agrawal
