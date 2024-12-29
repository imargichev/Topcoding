package org.example.strings;

public class ReverseString {
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        reverseString(s);
        System.out.println();
    }
    public static void reverseString(char[] s) {

        for (int i = s.length-1; i >= 0; i--) {
            if (i == 0){
                System.out.print("\""+s[i]+"\"");
            }else {
                System.out.print("\""+s[i]+"\",");
            }


        }
        
    }
}
