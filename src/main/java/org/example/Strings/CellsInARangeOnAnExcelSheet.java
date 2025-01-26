package org.example.Strings;

import java.util.ArrayList;
import java.util.List;

public class CellsInARangeOnAnExcelSheet {
    public static void main(String[] args) {
        String s = "A1:F1";
        cellsInRange(s);
    }

    public static List<String> cellsInRange(String s) {
        String[] cells = s.split(":");

        List<String> result = new ArrayList<>();

        //"<col1><row1>:<col2><row2>"
        char col1 = cells[0].charAt(0);
        char col2 = cells[1].charAt(0);

        int row1 = Integer.parseInt(cells[0].substring(1));
        int row2 = Integer.parseInt(cells[1].substring(1));


        for (char col = col1; col <= col2; col++) {
            // Iterate over the rows
            for (int row = row1; row <= row2; row++) {
                // Generate cell
                result.add("" + col + row);
                System.out.println("" + col + row);
            }
        }
        return result;
    }
}
