package org.example.Strings;

public class ConvertDateToBinary {
    public static void main(String[] args) {
        String input = "2080-02-29";
        System.out.println(convertDateToBinary(input));
    }
    public static String convertDateToBinary(String date) {
        String [] dateArray = date.split("-");
        StringBuilder binaryDate = new StringBuilder();
        for (String part : dateArray) {
            int number = Integer.parseInt(part);
            binaryDate.append(Integer.toBinaryString(number)).append("-");
        }
        return binaryDate.substring(0, binaryDate.length() - 1);
    }
}
