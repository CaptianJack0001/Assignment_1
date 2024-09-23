package com.deloitte.lab7.ex4;

import java.util.HashMap;
import java.util.Map;

public class MedalAwarder {
    public static Map<String, String> getStudents(HashMap<String, Integer> marksMap) {
        Map<String, String> medalMap = new HashMap<>();
        
        for (Map.Entry<String, Integer> entry : marksMap.entrySet()) {
            String studentId = entry.getKey();
            int marks = entry.getValue();

            if (marks >= 90) {
                medalMap.put(studentId, "Gold");
            } else if (marks >= 80) {
                medalMap.put(studentId, "Silver");
            } else if (marks >= 70) {
                medalMap.put(studentId, "Bronze");
            }
        }
        
        return medalMap;
    }

    public static void main(String[] args) {
        HashMap<String, Integer> marks = new HashMap<>();
        marks.put("101", 95);
        marks.put("102", 85);
        marks.put("103", 75);
        marks.put("104", 60);

        Map<String, String> medals = getStudents(marks);
        System.out.println("Students and their Medals: " + medals);
    }
}
