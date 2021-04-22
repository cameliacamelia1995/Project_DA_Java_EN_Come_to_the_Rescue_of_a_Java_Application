package com.hemebiotech.analytics;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesPaths {

    private Properties properties = new Properties();

    public PropertiesPaths() {
        String appConfigPath = "Project02Eclipse/src/resources/config.properties";
        try {
            this.properties.load(new FileInputStream(appConfigPath));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public String getProperty(String key) {
        return this.properties.getProperty(key);
    }
}