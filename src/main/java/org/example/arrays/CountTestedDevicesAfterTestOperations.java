package org.example.arrays;

public class CountTestedDevicesAfterTestOperations {
    public static void main(String[] args) {
        int[] battery = {1,1,2,1,3};
        System.out.println(countTestedDevices(battery));
    }

    public static int countTestedDevices(int[] batteryPercentages) {
        int n = batteryPercentages.length;
        int countOfTesterDevices = 0;
        for (int i = 0; i < n; i++) {
            if (batteryPercentages[i] > 0){
                batteryPercentages[i] = batteryPercentages[i]-1;
                countOfTesterDevices++;
                for (int j = 0; j < n; j++) {
                    batteryPercentages[j] = batteryPercentages[j] -1;
                }
            }

        }
        return countOfTesterDevices;
    }
}
