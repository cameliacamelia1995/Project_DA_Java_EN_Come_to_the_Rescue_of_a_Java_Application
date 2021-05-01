package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.TreeMap;

/**
 * @author camelia
 * The ReadSymptomDataFromFile objective is to read and sort out the symptoms from the symptoms.txt file
 */
public class ReadSymptomDataFromFile {
    /**
     *<p>Tree Map named symptoms
     *
     */
    private TreeMap<String, Integer> symptoms;
    /**
     *
     * @param file : file that will be read
     * @throws Exception
     *
     * BufferedReader will read the file attached to the TreeMap symptoms.
     * The this keyword is a reference to the file object
     *
     * TreeMap will sort out and count word in the symptoms file
     *
     *<p> We declare a StringLine and reader readerLine allow to read
     * every line of the symptoms file.<p>
     *
     * We add loop and conditions to get and put the line symptoms
     * This keyword allows to improve the code's reading to make it less ambiguous
     *
     *<p> We declare a primitive type which call occurrence and then we can increment
     * the count of every symptoms in the file.<p>
     *
     * Once the reading is done we close this one.
     *
     * At the end we create a getter that will be used in the main
     */

    public void readSymptom(File file) throws Exception {

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

    public TreeMap<String, Integer> getMyMap() {
        return this.symptoms;
    }
}