package org.example.arrays;

import java.util.Arrays;

public class DeleteGreatestValueInEachRow {
    public static void main(String[] args) {
        int [][] array = {{1,2,4},{3,3,1}};
        int result = deleteGreatestValue(array);
        System.out.println(result);
    }
    public static int deleteGreatestValue(int[][] grid) {
        int result = 0;

        // 1. Сортиране на всеки ред в матрицата в низходящ ред
        for (int[] row : grid) {
            Arrays.sort(row);
        }

        // 2. Итерация през колоните (от най-дясната към най-лявата)
        int numColumns = grid[0].length;
        for (int col = numColumns - 1; col >= 0; col--) {
            int maxInColumn = 0;

            // 3. Намиране на максималната стойност за текущата колона
            for (int[] row : grid) {
                maxInColumn = Math.max(maxInColumn, row[col]);
            }

            // 4. Добавяне на най-голямата стойност от колоната към резултата
            result += maxInColumn;
        }

        return result;
    }
}
