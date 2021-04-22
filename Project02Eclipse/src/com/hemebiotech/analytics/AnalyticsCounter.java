package com.hemebiotech.analytics;

import java.io.File;
import java.util.TreeMap;

/**
 * @author camelia
 * Analytics Counter is the main method class for lauching the program
 */
public class AnalyticsCounter {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String args[]) throws Exception {

        // Step 1 : know how to open the txt file in java (symptoms.txt)
        // Step 2 : browse the file (the method to get back every line)
        // Step 3 : list the symptoms in alphabetical order and count them (TreeMap)
        // Step 4 : write and exit the file result.out
        PropertiesPaths propertiesPaths = new PropertiesPaths();
        File file = new File(propertiesPaths.getProperty("input"));
        ReadSymptomDataFromFile symptomsFile = new ReadSymptomDataFromFile();
        symptomsFile.ReadSymptom(file);

        TreeMap<String, Integer> symptoms = symptomsFile.getMyMap();

        WriteSymptomsFile write = new WriteSymptomsFile();
        write.Result(symptoms);
    }
}