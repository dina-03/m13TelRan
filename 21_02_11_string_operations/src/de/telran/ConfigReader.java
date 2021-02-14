package de.telran;

import java.awt.*;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.List;

public class ConfigReader {

    private static final String DEFAULT_PATHS = "paths";
    Properties properties;

    ConfigReader(String filePaths) throws IOException {
        properties = new Properties();
        properties.load(new FileReader(filePaths));
    }

    public List<String> getOperationPaths(){
        //TODO split the pathsStr to the list of paths
        return null;
    }

}
