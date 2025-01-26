package org.example.Strings;

public class MinimumNumberOfChairsinAWaitingRoom {
    public static void main(String[] args) {
        String s = "ELEELEELLL";
        System.out.println(minimumChairs(s));
    }
    public static int minimumChairs(String s) {

        int peopleInRoom = 0;
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'E'){
                peopleInRoom++;
                result = Math.max(peopleInRoom,result);
            } else if (s.charAt(i) == 'L') {
                peopleInRoom--;
            }
        }

        return result;

    }
}
