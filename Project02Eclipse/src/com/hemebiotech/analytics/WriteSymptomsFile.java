package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author camelia
 * The WriteSymptomsFile class objective is to write the symptoms result in result.out
 * We used and instance the propertiesPaths to include this one in Bufferedwriter
 */
public class WriteSymptomsFile {
    private final PropertiesPaths propertiesPaths;

    public WriteSymptomsFile() {
        this.propertiesPaths = new PropertiesPaths();

    }
    /**
     * @param symptoms
     * This method declare a BufferedWriter
     *
     * <p>The code use the try/catch to avoid errors on the file
     * <p>Inside the BufferedWriter we add the propertiesPaths
     * to get the output file.<p>
     *
     * <p>The for loop will set the writing symptoms
     * for each entry of String & Integer from the symptoms entry set.<p>
     *
     * BufferedWriter will write each key and value
     * Then the stream is flushed, once the writing is done.
     *
     * And finally the stream is closed.
     */
    public void Result(TreeMap<String, Integer> symptoms) {
        // next generate output
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(this.propertiesPaths.getProperty("output")));
            for (Map.Entry<String, Integer> entree : symptoms.entrySet()) {
                writer.write(entree.getKey() + ":" + entree.getValue());
                writer.newLine();
            }
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (writer != null)
                    writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}