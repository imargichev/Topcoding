package org.example.HashTable;

import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

public class CountElementsWithMaximumFrequencyTOP {
    public static void main(String[] args) {
        int [] nums = {1,2,2,3,1,4};
        System.out.println(maxFrequencyElements(nums));
    }
    public static int maxFrequencyElements(int[] nums) {
        TreeMap<Integer, Integer> frequencyNumbers = new TreeMap<>();
        int maxFrequency = 0; //ще пази най-високата честота, която срещаме в масива
        int totalCount = 0; //ще брои колко елемента имат тази максимална честота.

        // Преброяване на честотите
        for (int num : nums) {
            //frequencyMap.getOrDefault(num, 0) връща текущата честота на num или 0, ако числото още не е добавено.
            //Добавяме 1 към честотата и записваме новата стойност обратно в frequencyMap.
            int freq = frequencyNumbers.getOrDefault(num, 0) + 1;
            frequencyNumbers.put(num, freq);

            // Актуализиране на максималната честота
            if (freq > maxFrequency) {
                maxFrequency = freq;
                totalCount = freq;// Нулираме и започваме отначало
                /*Проверяваме дали новата честота freq е по-голяма от текущия maxFrequency:
                Ако е така → обновяваме maxFrequency и зануляваме totalCount, като започваме да броим отново.
                Ако freq е равна на maxFrequency, добавяме тази честота към totalCount.*/
            } else if (freq == maxFrequency) {
                totalCount += freq;
            }
        }

        return totalCount;
    }
}
