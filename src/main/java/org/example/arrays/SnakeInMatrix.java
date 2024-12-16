package org.example.arrays;

import java.util.List;

/**
 * This class provides a method to determine the final position of a snake in an n x n matrix grid after following a sequence of commands.
 */
public class SnakeInMatrix {
    /**
     * Main method to test the finalPositionOfSnake function.
     *
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        int n = 2;
        List<String> commands = List.of("RIGHT", "DOWN");
        System.out.println(new SnakeInMatrix().finalPositionOfSnake(n, commands));
    }

    /**
     * Determines the final position of the snake in the grid after executing the given commands.
     *
     * @param n The size of the grid (n x n)
     * @param commands The list of commands to move the snake
     * @return The position of the final cell where the snake ends up
     */
    public int finalPositionOfSnake(int n, List<String> commands) {
        int x = 0, y = 0;

        // Process each command to update the snake's position
        for (String command : commands) {
            switch (command) {
                case "UP":    x--; break;
                case "DOWN":  x++; break;
                case "LEFT":  y--; break;
                case "RIGHT": y++; break;
            }
        }

        // Print the grid (for debugging purposes)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print((i * n) + j + " ");
            }
            System.out.println();
        }

        // Calculate and return the final position of the snake
        return (x * n) + y;
    }
}