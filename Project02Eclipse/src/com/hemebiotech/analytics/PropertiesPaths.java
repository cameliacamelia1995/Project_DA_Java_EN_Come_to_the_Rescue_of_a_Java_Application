package com.hemebiotech.analytics;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesPaths {
    //new instance of Properties properties
    private Properties properties = new Properties();

    public PropertiesPaths() {
        //declaring the path (appConfigPath)
        String appConfigPath = "Project02Eclipse/src/resources/config.properties";
        try {
            this.properties.load(new FileInputStream(appConfigPath));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //return the file with properties to use in another class
    public String getProperty(String key) {
        return this.properties.getProperty(key);
    }
}