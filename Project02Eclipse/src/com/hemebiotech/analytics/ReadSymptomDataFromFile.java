package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.TreeMap;
/**
 * @author camelia
 * The ReadSymptom class allows to read the symptoms file
 *
 */
public class ReadSymptomDataFromFile {
    /**
     * Tree Map allows to sort the symptoms file
     */
    private TreeMap<String, Integer> symptoms;
    /**
     *
     * @param file : file that will be read
     * @throws Exception
     */

    public void ReadSymptom(File file) throws Exception {

        BufferedReader reader = new BufferedReader(new FileReader(file));
        this.symptoms = new TreeMap<>();

        String line;
        while ((line = reader.readLine()) != null) {
            if (this.symptoms.get(line) == null) {
                this.symptoms.put(line, 1);
            } else {
                int occurence = this.symptoms.get(line);
                occurence++;
                this.symptoms.put(line, occurence);
            }
        }
        reader.close();
        System.out.println(this.symptoms);
    }

    // Created a getter and used the map in another class
    public TreeMap<String, Integer> getMyMap() {
        return this.symptoms;
    }
}