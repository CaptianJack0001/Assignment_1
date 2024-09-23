package com.deloitte.lab7.ex6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VoterEligibility {
    public static List<String> votersList(Map<String, Integer> idAgeMap) {
        List<String> eligibleVoters = new ArrayList<>();
        
        for (Map.Entry<String, Integer> entry : idAgeMap.entrySet()) {
            if (entry.getValue() > 18) {
                eligibleVoters.add(entry.getKey());
            }
        }
        
        return eligibleVoters;
    }

    public static void main(String[] args) {
        Map<String, Integer> idAgeMap = new HashMap<>();
        idAgeMap.put("101", 20);
        idAgeMap.put("102", 17);
        idAgeMap.put("103", 25);

        List<String> voters = votersList(idAgeMap);
        System.out.println("Eligible Voters: " + voters);
    }
}
