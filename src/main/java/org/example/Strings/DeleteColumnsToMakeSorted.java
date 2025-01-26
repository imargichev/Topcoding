package org.example.Strings;

public class DeleteColumnsToMakeSorted {
    public static void main(String[] args) {
        String[] strs = {"cba","daf","ghi"};
        System.out.println(minDeletionSize(strs));
    }
    public static int minDeletionSize(String[] strs){
        int count = 0;

        for (int j = 0; j < strs[0].length(); j++) {
            for (int i = 0; i < strs.length - 1; i++) {
                if (strs[i].charAt(j) > strs[i + 1].charAt(j)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}
