package org.example.Strings;

import java.util.HashSet;

public class JewelsAndStones {
    public static void main(String[] args) {
        String stones  = "aAAbbbb";
        String jewels = "aA";
        System.out.println(numJewelsInStones(jewels,stones));
    }
    public static int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> chars = new HashSet<>();

        for (char jewel : jewels.toCharArray()) {
            chars.add(jewel);
        }

        int count = 0;
        for (char stone : stones.toCharArray()) {
            if (chars.contains(stone)) {
                count++;
            }
        }
        return count;



    }
}
