package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.TreeMap;

public class ReadSymptomDataFromFile {
    private TreeMap<String, Integer> mape;

    // first get input
    public void ReadSymptom(File file) throws Exception {

        BufferedReader reader = new BufferedReader(new FileReader(file));
        this.mape = new TreeMap<>();

        String line;
        while ((line = reader.readLine()) != null) {
            if (this.mape.get(line) == null) {
                this.mape.put(line, 1);
            } else {
                int occurence = this.mape.get(line);
                occurence++;
                this.mape.put(line, occurence);
            }
        }
        reader.close();
        System.out.println(this.mape);
    }
    // Cree un getter pour utilise map dans une autre classe
    public TreeMap<String, Integer> getMyMap() {
        return this.mape;
    }
}