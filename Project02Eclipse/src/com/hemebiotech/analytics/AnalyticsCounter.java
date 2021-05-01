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

        PropertiesPaths propertiesPaths = new PropertiesPaths();

        File file = new File(propertiesPaths.getProperty("input"));
        ReadSymptomDataFromFile symptomsFile = new ReadSymptomDataFromFile();
        symptomsFile.readSymptom(file);
        TreeMap<String, Integer> symptoms = symptomsFile.getMyMap();
        WriteSymptomsFile write = new WriteSymptomsFile();
        write.result(symptoms);
    }
}