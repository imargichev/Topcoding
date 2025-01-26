package org.example.Strings;

public class DetermineColorOfAChessboardSquare {
    public static void main(String[] args) {
        String coordinates = "h3";
        System.out.println(squareIsWhite(coordinates));
    }
    public static boolean squareIsWhite(String coordinates) {


        int first = 0;
        char c = coordinates.charAt(0);
        int second = Integer.parseInt(String.valueOf(coordinates.charAt(1)));

        if (c == 'a'){
            first = 0;
        } else if (c == 'b') {
            first = 1;
        } else if (c == 'c') {
            first = 2;
        } else if (c == 'd') {
            first = 3;
        } else if (c == 'e') {
            first = 4;
        } else if (c == 'f') {
            first = 5;
        } else if (c == 'g') {
            first = 6;
        }else if (c == 'h') {
            first = 7;
        }

        return (first + second) % 2 == 0;
    }
}
