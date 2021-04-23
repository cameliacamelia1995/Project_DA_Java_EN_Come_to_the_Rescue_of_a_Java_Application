package com.hemebiotech.analytics;

import java.io.File;
import java.util.TreeMap;

/**
 * @author camelia
 * Analytics Counter is the main that will launch the program
 */
public class AnalyticsCounter {
    /**
     * @param args
     * @throws Exception
     *
     * <p>Creation of an instance of propertiesPaths
     * then we have access to config.properties<p>
     *
     * <p> We instantiate the file and we indicate the path
     * that will be read.<p>
     *
     * <p> We use the getter that we wrote in the ReadSymptomsDataFromFile class
     * to get the symptoms map in this class.<p>
     *
     * We declare the file that will write the symptoms result
     */
    public static void main(String args[]) throws Exception {
        // Step 1 : know how to open the txt file in java (symptoms.txt)
        // Step 2 : browse the file (the method to get back every line)
        // Step 3 : list the symptoms in alphabetical order and count them (TreeMap)
        // Step 4 : write and exit the file result.out
        // Step 5 : The code will also write the properties

        PropertiesPaths propertiesPaths = new PropertiesPaths();
        //We declare the file with paths that will be read
        File file = new File(propertiesPaths.getProperty("input"));
        ReadSymptomDataFromFile symptomsFile = new ReadSymptomDataFromFile();
        symptomsFile.ReadSymptom(file);
        //Using the getter "get My Map" that we create in ReadSymptomsDataFromFile
        TreeMap<String, Integer> symptoms = symptomsFile.getMyMap();
        //We declare the file that will write the symptoms result
        WriteSymptomsFile write = new WriteSymptomsFile();
        write.Result(symptoms);
    }
}