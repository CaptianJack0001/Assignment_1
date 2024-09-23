package com.deloitte.lab7.ex1;

import java.util.*;

public class CollectionExercise {
    public static List<Object> getValues(HashMap<?, ?> map) {
        List<Object> values = new ArrayList<>(map.values());
        Collections.sort((List) values);
        return values;
    }

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Alice", 25);
        map.put("Bob", 22);
        map.put("Charlie", 30);

        List<Object> sortedValues = getValues(map);
        System.out.println("Sorted Values: " + sortedValues);
    }
}
