package org.example.strings;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MaximumValueOfaStringInAnArray {
    public static void main(String[] args) {
        String[] strs = {"iw1","61939","7","7i","cye","bv7yg","t3ye6","990"};
        System.out.println(maximumValue(strs));
    }
    public static int maximumValue(String[] strs) {
        int maxNumber = 0;

        for (int i = 0; i < strs.length; i++) {
            boolean isOnlyDigits = true;
            for (int j = 0; j < strs[i].length(); j++) {
                if (!Character.isDigit(strs[i].charAt(j))) {
                    isOnlyDigits = false;
                    break;
                }
            }
            if (isOnlyDigits) {
                maxNumber = Math.max(Integer.parseInt(strs[i]), maxNumber);
            } else {
                maxNumber = Math.max(strs[i].length(), maxNumber);
            }
        }
        return maxNumber;
    }
}
