package org.example.Strings;

public class GoalParserInterpretation {
    public static void main(String[] args) {
        String string = "G()(al)";
        System.out.println(interpret(string));
    }
    public static String interpret(String command) {
        String newString = command
                .replace("()","o")
                .replace("(","")
                .replace(")","");

        return newString;
    }
}
