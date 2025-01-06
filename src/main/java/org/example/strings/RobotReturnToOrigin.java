package org.example.strings;

public class RobotReturnToOrigin {
    public static void main(String[] args) {
        String moves1 = "UD";
        String moves2 = "LL";

        System.out.println(judgeCircle(moves2));
    }
    public static boolean judgeCircle(String moves) {
        int x = 0, y = 0;

        for (char command : moves.toCharArray()) {
            switch (command) {
                case 'U': x++; break;
                case 'D': x--; break;
                case 'L': y++; break;
                case 'R': y--; break;
            }
        }

        return x == 0 && y == 0;

    }
}
