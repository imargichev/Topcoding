package org.example.BinarySearch;

public class CountNegativeNumbersInASortedMatrix {
    public static void main(String[] args) {
       int[][] grid = {
               {4,3,2,-1},
               {3,2,1,-1},
               {1,1,-1,-2},
               {-1,-1,-2,-3}
       };
        System.out.println(countNegatives(grid));
    }
    public static int countNegatives(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;

        for (int row = 0; row < m; row++) {
            if (grid[row][n - 1] >= 0) {
                continue;
            } else if (grid[row][0] < 0) {
                count += n * (m - row);
                break;
            } else {
                int left = 0;
                int right = n - 1;

                while (left <= right) {
                    int mid = left + (right - left) / 2;
                    if (grid[row][mid] < 0) {
                        right = mid - 1;
                    } else {
                        left = mid + 1;
                    }
                }
                count += n - left;
            }
        }
        return count;
    }


}
