package com.hemebiotech.analytics;

import java.io.File;
import java.util.TreeMap;

public class AnalyticsCounter {

    // first get input
    public static void main(String args[]) throws Exception {
        File file = new File("/Users/camelia95/IdeaProjects/Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application/Project02Eclipse/symptoms.txt");
        ReadSymptomDataFromFile symptomsFile = new ReadSymptomDataFromFile();
        symptomsFile.ReadSymptom(file);

        TreeMap<String, Integer> symptoms = symptomsFile.getMyMap();

        WriteSymptomsFile write = new WriteSymptomsFile();
        write.Result(symptoms);
    }
}