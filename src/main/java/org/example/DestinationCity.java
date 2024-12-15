package org.example;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DestinationCity {
    public static void main(String[] args) {

    }
    public static String destCity(List<List<String>> paths) {

        Set<String> outgoingCities = new HashSet<>();


        for (List<String> path : paths) {
            outgoingCities.add(path.getFirst()); // Добавяме cityAi
        }

        for (List<String> path : paths){
            String cityB = path.get(1);
            if (!outgoingCities.contains(cityB)){
                return cityB;
            }
        }
        return "";
    }
}
