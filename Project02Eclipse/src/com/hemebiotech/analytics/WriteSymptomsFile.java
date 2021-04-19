package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class WriteSymptomsFile {

    public void Result(TreeMap<String, Integer> symptoms) {

        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter("/Users/camelia95/IdeaProjects/Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application/Project02Eclipse/result.out"));
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