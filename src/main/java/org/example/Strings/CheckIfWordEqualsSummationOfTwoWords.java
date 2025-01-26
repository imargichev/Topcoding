package org.example.Strings;

public class CheckIfWordEqualsSummationOfTwoWords {
    public static void main(String[] args) {
        String firstWord = "ajaie", secondWord = "ihh", targetWord = "jjgb";
        System.out.println(isSumEqual(firstWord,secondWord,targetWord));
    }
    public static boolean isSumEqual(String firstWord, String secondWord, String targetWord) {

            int firstNumber = convertWordToNumber(firstWord);
            int secondNumber = convertWordToNumber(secondWord);
            int targetNumber = convertWordToNumber(targetWord);

            return (firstNumber + secondNumber) == targetNumber;
        }

        private static int convertWordToNumber(String word) {
            StringBuilder sb = new StringBuilder();
            for (char c : word.toCharArray()) {
                sb.append(c - 'a');
            }
            return Integer.parseInt(sb.toString());
        }
    }
